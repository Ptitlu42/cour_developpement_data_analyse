package p99

import org.scalatest.{ FlatSpec, Matchers }

class P12Spec extends FlatSpec with Matchers {

  "decode" should "return decoded a run-length encoded list" in {
    P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should equal(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    P12.decode(Nil) should equal(Nil)
  }
}