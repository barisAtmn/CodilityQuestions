import scala.collection.JavaConverters._

/*
* Find longest sequence of zeros in binary representation of an integer.
*/

object Solution {
  def solution(n: Int): Int = {
   val regex = raw"(?=(10*1))".r
   val result = regex.findAllMatchIn(n.toBinaryString).map(_.group(1)) match {
    case re:Iterator[String] if !re.isEmpty => (re.toList.map(Integer.parseInt(_, 2)).sorted.last.toBinaryString.length - 2)
    case _ => 0
  }
  result
  }
}
