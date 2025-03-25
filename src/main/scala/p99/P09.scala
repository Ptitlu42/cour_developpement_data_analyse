package p99

/**
 * 
 * P09 (**) Pack consecutive duplicates of list elements into sublists.
 * [If a list contains repeated elements they should be placed in separate sublists.]
 * 
 * Example:
 * 
 * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
 * 
 */
object P09 {

  // We have to handle initial value of accumulator as 'List(Nil)' to return seed value
  // because we can't invoke combinators on empty lists.
  def pack[T](ls: List[T]): Unit = {} // TODO
}