package p99

import org.scalatest.{ FlatSpec, Matchers }

class P11Spec extends FlatSpec with Matchers {

  "encodeModified" should "return modified run-length encoding of a list" in {
    P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e)))
    P11.encodeModified(Nil) should equal(Nil)
  }
}