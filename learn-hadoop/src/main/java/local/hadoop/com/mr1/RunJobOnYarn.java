package local.hadoop.com.mr1;

import org.apache.hadoop.util.RunJar;

/**
 * Created by araj015 on 4/28/2017.
 */
public class RunJobOnYarn {

    public static void main(String args[]){

        runJar("C:\\work\\GIT-HUB\\local-hadoop-cluster\\learn-hadoop\\target\\learn-hadoop-0.0.1-SNAPSHOT.jar","local.hadoop.com.mr1.WordCount");

    }

    public static void runJar(String jarLocation,String mainClass){
        try {
            RunJar.main(new String[]{jarLocation,mainClass});
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
