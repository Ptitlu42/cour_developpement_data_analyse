package p99

import org.scalatest.{ FlatSpec, Matchers }

class P02Spec extends FlatSpec with Matchers {

  "secondLastElement" should "return second last element from a list of number" in {
    P02.secondLastElement(List(1, 2, 3, 4, 5)) should equal(4)
  }

  it should "throw NoSuchElementException when the list passed is empty" in {
    intercept[NoSuchElementException] { P02.secondLastElement(Nil) }
  }

  "secondLastElement" should "return second last element from a list of character" in {
    P02.secondLastElement(List('a', 'b', 'c', 'd', 'e')) should equal('d')
  }

  it should "throw NoSuchElementException when the list passed is empty list" in {
    intercept[NoSuchElementException] { P02.secondLastElement(List()) }
  }

  it should "throw NoSuchElementException when the list passed is empty string" in {
    intercept[NoSuchElementException] { P02.secondLastElement(List.empty[String]) }
  }

  it should "throw NoSuchElementException when the list passed has only one element" in {
    intercept[NoSuchElementException] { P02.secondLastElement(List(1)) }
  }

}