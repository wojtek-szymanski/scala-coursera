package demo

import org.scalatest.FlatSpec

class HigherOrderFunctionTest extends FlatSpec {

  val higherOrderFunction = new HigherOrderFunction

  "simple sum of 1..3 " should "return 6" in {
    assert(higherOrderFunction.sum(x => x, 1, 3) == 6)
  }

  "simple sumInts of 1..3 " should "return 6" in {
    assert(higherOrderFunction.sumInts(1, 3) == 6)
  }

  "simple sumCubes of 1..3 " should "return 1+8+27" in {
    assert(higherOrderFunction.sumCubes(1, 3) == 1+8+27)
  }
}