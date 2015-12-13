package demo

class HigherOrderFunction {

  def sum(f: Int => Int, from: Int, to: Int): Int = {
    if (from > to) 0 else f(from) + sum(f, from + 1, to)
  }

  def sumInts(from: Int, to: Int) = sum(id, from, to)

  def id(x: Int) = x;

  def sumCubes(from: Int, to: Int) = sum(cube, from, to)

  def cube(x: Int) = x * x * x;
}
