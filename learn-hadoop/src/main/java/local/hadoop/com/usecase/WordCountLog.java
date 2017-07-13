package local.hadoop.com.usecase;

import local.hadoop.com.mr1.WordCount;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Counter;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.StringUtils;

import java.io.*;
import java.net.URI;
import java.util.*;

/**
 * Created by araj015 on 5/10/2017.
 */
public class WordCountLog {

    public static class TokenizerMapper
            extends Mapper<Object, Text, Text, IntWritable> {


        private final static IntWritable one = new IntWritable(1);
        private Text word = new Text();

        private Configuration conf;
        private BufferedReader fis;


        @Override
        public void setup(Context context) throws IOException,
                InterruptedException {

            writeLogToFile("C:\\Logs\\mapr.log","=============================Start of Mapper=================================================");
            super.setup(context);
        }

        @Override
        public void map(Object key, Text value, Context context
        ) throws IOException, InterruptedException {

            writeLogToFile("C:\\Logs\\MapperIn.log","keyIn = "+key.toString());
            writeLogToFile("C:\\Logs\\MapperIn.log","valueIn = "+value.toString());

            String line = value.toString().toLowerCase();
            StringTokenizer itr = new StringTokenizer(line);
            while (itr.hasMoreTokens()) {
                word.set(itr.nextToken());
                writeLogToFile("C:\\Logs\\MapperOut.log","keyOut = "+word.toString());
                writeLogToFile("C:\\Logs\\MapperOut.log","valueOut = "+one.toString());
                context.write(word, one);
               /* Counter counter = context.getCounter(WordCountLog.TokenizerMapper.CountersEnum.class.getName(),
                        WordCountLog.TokenizerMapper.CountersEnum.INPUT_WORDS.toString());
                counter.increment(1);*/
            }
        }
    }

    public static class IntSumReducer
            extends Reducer<Text,IntWritable,Text,IntWritable> {
        private IntWritable result = new IntWritable();

        @Override
        public void setup(Context context) throws IOException, InterruptedException {
            writeLogToFile("C:\\Logs\\mapr.log","=============================Start of Reducer=================================================");
            super.setup(context);
        }

        public void reduce(Text key, Iterable<IntWritable> values,
                           Context context
        ) throws IOException, InterruptedException {
            writeLogToFile("C:\\Logs\\ReducerIn.log","reducerKeyIn = "+key.toString());
            List<String> listt = new ArrayList<String>();
            int sum = 0;
            for (IntWritable val : values) {
                listt.add(val.toString());
                sum += val.get();
            }
            writeLogToFile("C:\\Logs\\ReducerIn.log","reducerValueIn = "+StringUtils.join(", ", listt));
            result.set(sum);

            writeLogToFile("C:\\Logs\\ReducerOut.log","ReducerKeyOut = "+key.toString());
            writeLogToFile("C:\\Logs\\ReducerOut.log","ReducerValueOut = "+result.toString());
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
        job.setJarByClass(WordCountLog.class);
        job.setMapperClass(WordCountLog.TokenizerMapper.class);
        job.setCombinerClass(WordCountLog.IntSumReducer.class);
        job.setReducerClass(WordCountLog.IntSumReducer.class);
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
        FileInputFormat.addInputPath(job, new Path("/user/araj/hadoop_guide"));
        FileOutputFormat.setOutputPath(job, new Path("/user/araj/out/"+new Date().getTime()));

        job.setJarByClass(WordCount.class);
        //job.setJar("C:\\work\\GIT-HUB\\local-hadoop-cluster\\learn-hadoop\\target\\learn-hadoop-0.0.1-SNAPSHOT.jar");
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }

    public static void writeLogToFile(String filename,String toappend){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            File file = new File(filename);
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(toappend);
            bw.write("\n");
            //System.out.println("File writer Done !!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {

                ex.printStackTrace();
            }
        }
    }

}
