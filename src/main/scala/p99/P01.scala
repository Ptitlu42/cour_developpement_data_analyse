package p99

/**
 *
 * P01 (*) Find the last element of a list.
 * Example:
 *
 * scala> last(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 8
 *
 */
object P01 {

  def lastElement[T](ls: List[T]): T = {
    ls.last
  }
  
  def main(args: Array[String]): Unit = {
    println("\n\nP01\n")
    println(lastElement(List(1, 1, 2, 3, 5, 8)))
  }
}