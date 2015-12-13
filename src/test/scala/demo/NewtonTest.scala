package demo

import org.scalatest.FunSuite

class NewtonTest extends FunSuite {

  test("should sqrt works correctly") {
    val newton = new Newton
    assert(newton.sqrt(4) === 2)
  }
}
