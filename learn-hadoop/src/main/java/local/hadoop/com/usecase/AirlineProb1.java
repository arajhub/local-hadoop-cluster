package local.hadoop.com.usecase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;
import java.util.Date;

/**
 * Created by araj015 on 5/4/2017.
 */
public class AirlineProb1 {


    public static class TokenizerMapper
            extends Mapper<Object, Text, Text, IntWritable> {

        private Configuration conf;

        @Override
        public void setup(Context context) throws IOException,
                InterruptedException {
           /* conf = context.getConfiguration();
            caseSensitive = conf.getBoolean("wordcount.case.sensitive", true);
            if (conf.getBoolean("wordcount.skip.patterns", true)) {
                URI[] patternsURIs = Job.getInstance(conf).getCacheFiles();
                for (URI patternsURI : patternsURIs) {
                    Path patternsPath = new Path(patternsURI.getPath());
                    String patternsFileName = patternsPath.getName().toString();
                    parseSkipFile(patternsFileName);
                }
            }*/
        }


        @Override
        public void map(Object key, Text value, Context context
        ) throws IOException, InterruptedException {

            long keyLong = ((LongWritable)key).get();
            if(keyLong != 0) { //To Skip first line of the csv file
                String line = value.toString();
                Text carrier = new Text(line.split(",")[8]);
                String arrDelay = line.split(",")[14];
                int arrDeplayInt;

                try{
                    arrDeplayInt=Integer.valueOf(arrDelay);
                    IntWritable arrDelayInt = new IntWritable(arrDeplayInt);
                    context.write(carrier, arrDelayInt);

                }catch (Exception e){
                    //System.out.println("=====>"+e.getMessage());
                }

            }
                /*Counter counter = context.getCounter(WordCount2.TokenizerMapper.CountersEnum.class.getName(),
                        WordCount2.TokenizerMapper.CountersEnum.INPUT_WORDS.toString());
                counter.increment(1);*/
        }
    }

    public static class IntSumReducer
            extends Reducer<Text,IntWritable,Text,IntWritable> {
        private IntWritable result = new IntWritable();

        @Override
        public void setup(Reducer.Context context)  throws IOException, InterruptedException  {

            context.write(new Text("Airline"),new IntWritable(0));

        }

        public void reduce(Text key, Iterable<IntWritable> values,
                           Context context
        ) throws IOException, InterruptedException {

            int max = 0;
            for (IntWritable val : values) {
                if(val.get() > max) {
                    max = val.get();
                }
            }
            result.set(max);
            context.write(key, result);
        }
    }

    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        conf.set("mapreduce.app-submission.cross-platform", "true");
        /*GenericOptionsParser optionParser = new GenericOptionsParser(conf, args);
        String[] remainingArgs = optionParser.getRemainingArgs();
        if (!(remainingArgs.length != 2 || remainingArgs.length != 4)) {
            System.err.println("Usage: wordcount <in> <out> [-skip skipPatternFile]");
            System.exit(2);
        }*/
        Job job = Job.getInstance(conf, "word count");
        job.setJarByClass(AirlineProb1.class);
        job.setMapperClass(AirlineProb1.TokenizerMapper.class);
        //job.setCombinerClass(AirlineProb1.IntSumReducer.class);
        job.setReducerClass(AirlineProb1.IntSumReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        job.getConfiguration().setBoolean("wordcount.skip.patterns", false);
        /*List<String> otherArgs = new ArrayList<String>();
        for (int i=0; i < remainingArgs.length; ++i) {
            if ("-skip".equals(remainingArgs[i])) {
                job.addCacheFile(new Path(remainingArgs[++i]).toUri());
                job.getConfiguration().setBoolean("wordcount.skip.patterns", true);
            } else {
                otherArgs.add(remainingArgs[i]);
            }
        }
        FileInputFormat.addInputPath(job, new Path(otherArgs.get(0)));
        FileOutputFormat.setOutputPath(job, new Path(otherArgs.get(1)));
        */
        FileInputFormat.addInputPath(job, new Path("/user/araj/airline/all"));
        FileOutputFormat.setOutputPath(job, new Path("/user/araj/airline/test/out/"+new Date().getTime()));

        job.setJarByClass(AirlineProb1.class);
        job.setJar("C:\\work\\GIT-HUB\\local-hadoop-cluster\\learn-hadoop\\target\\learn-hadoop-0.0.1-SNAPSHOT.jar");
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }



}
