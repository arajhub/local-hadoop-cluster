import java.io.{BufferedInputStream, File, FileInputStream}

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.{FileStatus, FileSystem, Path}

import scala.collection.immutable.HashMap

/**
  * Created by araj015 on 4/6/2017.
  */

import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import org.apache.hadoop.conf._
import org.apache.hadoop.fs._

object HDFSFileStats {

  private val conf = new Configuration()
  private val hdfsCoreSitePath = new Path("core-site.xml")
  private val hdfsHDFSSitePath = new Path("hdfs-site.xml")

  conf.addResource(hdfsCoreSitePath)
  conf.addResource(hdfsHDFSSitePath)

  private val fileSystem = FileSystem.get(conf)
  private var fileStatuss:List[FileStatus] = List()

  def getFileStatusAndFolderName(filepath: String): List[(String,Path,Long)] = {
    browse(fileSystem.listStatus(new Path(filepath))).map(a => (findFolderNameFromURL(a.getPath.toString),a.getPath,a.getModificationTime))
  }
    def browse(status: Array[FileStatus]): List[FileStatus] = {
      for (i: Int <- 0 to status.length-1) {
        val fileStatus = status(i)
        if (fileStatus.isDirectory()) {
          val subStatus = fileSystem.listStatus(fileStatus.getPath());
          browse(subStatus)
        } else {
          //println(fileStatus.getPath())
          fileStatuss = fileStatus :: fileStatuss
        }
      }
      fileStatuss
    }

  def findFolderNameFromURL(pathString:String): String ={
    pathString.split("/").takeRight(2).head
  }
}
object main extends App {

  val aa = HDFSFileStats.getFileStatusAndFolderName("/user/bdi/hive/chim_bdi.db").groupBy(_._1)
  println(aa)

}
