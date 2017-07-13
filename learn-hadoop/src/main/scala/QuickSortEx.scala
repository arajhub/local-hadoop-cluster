/**
  * Created by araj015 on 5/30/2017.
  */
object QuickSortEx {

  val aa= Array(1,2,10,3,4,5,2,99,12,121)






  def sortList(aa:Array[Int],low:Int,high:Int) : Unit ={

    val pivot = aa(high)
    var i = aa(low -1)
    for(j <- i to pivot){
      if(aa(j) < pivot){
        i+1
        val temp = aa(i)
        aa(i)=aa(j)
        aa(j)=temp

      }

    }


  }


}
