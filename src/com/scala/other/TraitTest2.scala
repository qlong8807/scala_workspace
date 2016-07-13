package com.scala.other

/**
  * Created by Administrator on 2016/7/12.
  * with关键字可以用来实现包装器的功能
  */
object TraitTest2 {
  def main(args: Array[String]) {
    var f:Friendly = new Dog
    println(f.greet)
    f = new HungryDog
    println(f.greet)
    f = new Dog with  Enhance
    println(f.greet)
    f = new HungryDog with Enhance
    println(f.greet)
  }
}
trait Friendly{
  def greet() = "hi,"
}
class Dog extends Friendly{
  override def greet()="this is a dog"
}
class HungryDog extends Friendly{
  override def greet()="dog want eat foods"
}
trait Enhance extends Friendly{
  override def greet() = super.greet()+"!!!"
}
