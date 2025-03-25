package p99

import org.scalatest.{ FlatSpec, Matchers }

class P01Spec extends FlatSpec with Matchers {

  "lastElement method" should "return last element from a list of number" in {
    P01.lastElement(List(1, 2, 3, 4, 5, 6)) should equal(6)
  }

  it should "throw NoSuchElementException when list passed is Nil" in {
    intercept[NoSuchElementException] { P01.lastElement(Nil) }
  }

  "lastElement method" should "return last element from a list of character" in {
    P01.lastElement(List('a', 'b', 'c', 'd', 'e')) should equal('e')
  }

  it should "throw NoSuchElementException when list passed is empty list" in {
    intercept[NoSuchElementException] { P01.lastElement(List()) }
  }
  
  it should "throw NoSuchElementException when list passed is list of empty int" in {
    intercept[NoSuchElementException] { P01.lastElement(List.empty[Int]) }
  }
}