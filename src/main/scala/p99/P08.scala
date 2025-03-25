package p99

/**
 * 
 * P08 (**) Eliminate consecutive duplicates of list elements.
 * [If a list contains repeated elements they should be replaced with a single copy of the element. 
 * The order of the elements should not be changed.]
 *
 * Example:
 *
 * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 * 
 */
object P08 {

  // In order to preserve the order of the elements we need to concatenate every unique subsequent element 
  // as list to the accumulator.
  def compress[T](ls: List[T]): Unit = {}
}
