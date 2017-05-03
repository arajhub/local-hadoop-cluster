/*
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
import org.apache.hadoop.mrunit.MapDriver;
import org.apache.hadoop.mrunit.MapReduceDriver;
import org.apache.hadoop.mrunit.ReduceDriver;
import org.apache.hadoop.util.GenericOptionsParser;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LogAnalysisTest {

    MapDriver<Object, Text, Text, IntWritable> mapDriver;
    ReduceDriver<Text, IntWritable, Text, IntWritable> reduceDriver;
    //MapReduceDriver<Object, Text, Text, IntWritable, Text, IntWritable> mapReduceDriver;

    @Before
    public void setUp() {
        local.hadoop.com.mr1.LogAnalysis.TokenizerMapper mapper = new local.hadoop.com.mr1.LogAnalysis.TokenizerMapper();
        local.hadoop.com.mr1.LogAnalysis.IntSumReducer reducer = new local.hadoop.com.mr1.LogAnalysis.IntSumReducer();
        mapDriver = MapDriver.newMapDriver(mapper);
        reduceDriver = ReduceDriver.newReduceDriver(reducer);
        //mapReduceDriver = MapReduceDriver.newMapReduceDriver(mapper, reducer);
    }
    @Test
    public void testMapper() throws Exception{
        mapDriver.withInput(new LongWritable(), new Text(
                "test"));
        mapDriver.withOutput(new Text("test"), new IntWritable(1));
        mapDriver.runTest();
    }

    @Test
    public void testReducer() throws Exception{
        List<IntWritable> values = new ArrayList<IntWritable>();
        values.add(new IntWritable(1));
        values.add(new IntWritable(1));
        reduceDriver.withInput(new Text("test"), values);
        reduceDriver.withOutput(new Text("test"), new IntWritable(2));
        reduceDriver.runTest();
    }

}
*/
