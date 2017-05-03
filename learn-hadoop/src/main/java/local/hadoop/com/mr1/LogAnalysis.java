package local.hadoop.com.mr1;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

import java.io.IOException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogAnalysis {

    public static class TokenizerMapper
            extends Mapper<Object, Text, Text, IntWritable> {

        private final static IntWritable one = new IntWritable(1);
        private Text word = new Text();

        private static final Pattern pattern =
                Pattern.compile("TRACE|DEBUG|INFO|WARN|ERROR|FATAL");

        public void map(Object key, Text value, Context context
        ) throws IOException, InterruptedException {

            String tokenArray[] = value.toString().split(" ");
            if(tokenArray.length > 2) {
                String token=tokenArray[2];
                final Matcher matcher = pattern.matcher(token);
                if (matcher.matches()) {
                    word.set(token);
                    context.write(word, one);
                }
            }
        }
    }

    public static class IntSumReducer
            extends Reducer<Text, IntWritable, Text, IntWritable> {
        private IntWritable result = new IntWritable();

        public void reduce(Text key, Iterable<IntWritable> values,
                           Context context
        ) throws IOException, InterruptedException {
            int sum = 0;
            for (IntWritable val : values) {
                sum += val.get();
            }
            result.set(sum);
            context.write(key, result);
        }
    }

    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        conf.set("mapreduce.app-submission.cross-platform", "true");
        String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
       /* if (otherArgs.length < 2) {
            System.err.println("Usage: wordcount <in> [<in>...] <out>");
            System.exit(2);
        }*/
        Job job = new Job(conf, "word count");
        job.setJarByClass(LogAnalysis.class);
        job.setMapperClass(TokenizerMapper.class);
        job.setCombinerClass(IntSumReducer.class);
        job.setReducerClass(IntSumReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat.addInputPath(job, new Path("/user/araj/log_analysis"));
        FileOutputFormat.setOutputPath(job, new Path("/user/araj/log_analysis_out/"+new Date().getTime()));
       /* for (int i = 0; i < otherArgs.length - 1; ++i) {
            FileInputFormat.addInputPath(job, new Path(otherArgs[i]));
        }
        FileOutputFormat.setOutputPath(job,
                new Path(otherArgs[otherArgs.length - 1]));*/
        job.setJarByClass(LogAnalysis.class);
        job.setJar("C:\\work\\GIT-HUB\\local-hadoop-cluster\\learn-hadoop\\target\\learn-hadoop-0.0.1-SNAPSHOT.jar");
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
