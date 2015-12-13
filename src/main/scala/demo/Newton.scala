package demo

class Newton {

  def sqrt(x: Double) : Double = {
    val epsilon = 1e-15
    var t = x
    while (Math.abs(t - x/t) > epsilon*t) {
      t = (x/t + t) / 2.0
    }
    t
  }
}
