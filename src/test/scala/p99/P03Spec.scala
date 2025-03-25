package p99

import org.scalatest.{ FlatSpec, Matchers }

class P03Spec extends FlatSpec with Matchers {

  "nthElement" should "return 4th element from a list" in {
    P03.nthElement(4, List(1, 2, 3, 4, 5)) should equal(4)
  }

  "nthElement" should "return 3th element from a list" in {
    P03.nthElement(4, List(1, 2, 3, 4, 5)) should equal(3)
  }

  it should "throw NoSuchElementException when list passed is empty" in {
    intercept[NoSuchElementException](P03.nthElement(4, Nil))
  }

  it should "throw NoSuchElementException when the position specified is greater than the size of the list" in {
    intercept[NoSuchElementException](P03.nthElement(10, List(1)))
  }

  "nthElement" should "return 2nd element from a list" in {
    P03.nthElement(2, List(1, 2, 3, 4, 5)) should equal(2)
  }

  "nthElement" should "return 3rd element from a list" in {
    P03.nthElement(3, List('a', 'b', 'c', 'd')) should equal('c')
  }

  "nthElement" should "return 1st element from a list" in {
    P03.nthElement(1, List("a", "b", "c", "d")) should equal("a")
  }
}