package p99

import org.scalatest.{ FlatSpec, Matchers }

class P14Spec extends FlatSpec with Matchers {

  "duplicate" should "return a list with elements duplicated in specified list" in {
    P14.duplicateFunctional(List('a, 'b, 'c, 'c, 'd)) should equal(List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
    P14.duplicateFunctional(Nil) should equal(Nil)
  }
}