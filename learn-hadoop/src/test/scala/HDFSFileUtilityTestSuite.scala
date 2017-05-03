import org.scalatest._
import org.scalatest.BeforeAndAfter

/**
  * Created by araj015 on 4/6/2017.
  */
class HDFSFileUtilityTestSuite extends FunSuite {

  test("Read HDFS File") {

   val inpStream = HDFSFileUtility.getFile("/user/araj/airline/1988/1988.csv")
    println(scala.io.Source.fromInputStream(inpStream).getLines().mkString("\n"))

  }



}
