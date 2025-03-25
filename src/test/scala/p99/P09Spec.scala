package p99

import org.scalatest.{ FlatSpec, Matchers }

class P09Spec extends FlatSpec with Matchers {

  "pack" should "return consecutive duplicate elements in a list packed into sublists." in {
    P09.pack(List(1, 1, 1, 2, 2, 1, 3, 3, 3, 4)) should equal (List(List(1, 1, 1), List(2, 2), List(1), List(3, 3, 3), List(4)))
  }

  "pack" should "return consecutive duplicate elements in a list packed into sublists (2)." in {
    P09.pack(List(1, 1, 1, 2, 2, 1, 3, 3, 3, 4)) should equal (List(List(1, 1, 1), List(2, 2), List(1), List(3, 3, 3), List(4)))
  }

  "pack" should "return consecutive duplicate elements in a list packed into sublists (3)." in {
    P09.pack(List(1, 1, 1, 2, 2, 1, 3, 3, 3, 4)) should equal (List(List(1, 1, 1), List(2, 2), List(1), List(3, 3, 3), List(4)))
  }

  "pack" should "return consecutive duplicate elements in a list packed into sublists (4)." in {
    P09.pack(List(1, 1, 1, 2, 2, 1, 3, 3, 3, 4)) should equal (List(List(1, 1, 1), List(2, 2), List(1), List(3, 3, 3), List(4)))
  }
  
}
