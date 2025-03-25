package p99

import org.scalatest.{FlatSpec, Matchers}

class P08Spec extends FlatSpec with Matchers {
  
  "compress" should "return list that has consecutive duplicates removed from a list" in {
    P08.compressFunctional(List(1, 1, 2, 3, 3, 4, 4, 4, 4)) should equal (List(1, 2, 3, 4))
    P08.compressFunctional(Nil) should equal (Nil)
  }
  
  "compress" should "return list that has consecutive duplicates removed from a list (2)" in {
    P08.compress(List(1, 1, 2, 3, 3, 4)) should equal (List(1, 2, 3, 4))
    P08.compress(List()) should equal (List())
  }
  
  "compress" should "return list that has consecutive duplicates removed from a list (3)" in {
    P08.compress(List(1, 2, 3, 4, 4)) should equal (List(1, 2, 3, 4))
  }
  
  "compress" should "return list that has consecutive duplicates removed from a list (4)" in {
    P08.compress(List(1, 2, 3, 4, 4)) should equal (List(1, 2, 3, 4))
  }
}