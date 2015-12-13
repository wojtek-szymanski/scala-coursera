import demo.{TailRecursion, Hello}

val hello = new Hello
println(hello.sayHello("Scala"))

val tailRecursion = new TailRecursion
val x = tailRecursion.gcd(2, 4);