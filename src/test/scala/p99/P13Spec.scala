package p99

import org.scalatest.{ FlatSpec, Matchers }

class P13Spec extends FlatSpec with Matchers {

  "encodeDirect" should "return run-length encoding of a list (direct solution)" in {
    P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    P13.encodeDirect(Nil) should equal(Nil)
  }
}