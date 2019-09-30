 // Returns the distance between the two closest numbers.
object ClosestNumbers extends App{

  val testArray: Array[Int] = Array(3, 9, 50, 15, 99, 6, 95, 65)

  scala.util.Sorting.quickSort(testArray)

  println(found(testArray.head, testArray.tail, testArray))

  def found(a:Int, array:Array[Int], arraytemp:Array[Int]):Int ={
    if(array.length == 0){
      scala.util.Sorting.quickSort(arraytemp)
      arraytemp.head
    }
    else
      found(array.head, array.tail, {arraytemp.update(array.length, (array.head - a)); arraytemp})
  }


}
