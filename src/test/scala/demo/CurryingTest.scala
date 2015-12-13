package demo

import org.scalatest.FlatSpec

class CurryingTest extends FlatSpec {

  val currying = new Currying

  "simple sumInts of 1..3 " should "return 6" in {
    assert(currying.sumInts(1, 3) == 6)
  }

  "simple sumCubes of 1..3 " should "return 1+8+27" in {
    assert(currying.sumCubes(1, 3) == 1+8+27)
  }

  "general sumCubes of 1..3 " should "return 1+8+27" in {
    assert(currying.sum(currying.cube)(1, 3) == 1+8+27)
  }

  "inline sumCubes of 1..3 " should "return 1+8+27" in {
    assert(currying.sum(x=>x*x*x)(1, 3) == 1+8+27)
  }

  "sumCubesInline of 1..3 " should "return 1+8+27" in {
    assert(currying.sumInline(x=>x*x*x)(1, 3) == 1+8+27)
  }

  "product of 2..4" should "return 2*3*4" in {
    assert(currying.product(x=>x)(2,4) == 2*3*4)
  }
}