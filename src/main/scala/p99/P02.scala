package p99

/**
 *
 * P02 (*) Find the last but one element of a list.
 * Example:
 *
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 * 
 */
object P02 {
    
  def secondLastElement[T](ls: List[T]): T = {
    if (ls.isEmpty || ls.tail.isEmpty) throw new NoSuchElementException
    ls.init.last
  }
}