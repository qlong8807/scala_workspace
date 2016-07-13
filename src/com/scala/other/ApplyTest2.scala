package com.scala.other

/**
  * Created by Administrator on 2016/7/11.
  */
object ApplyTest2 {
  def main(args: Array[String]) {
    val x = ApplyTest2(5)
    println(x)
    x match
    {
      case ApplyTest2(num) => println(x+" is bigger two times than "+num)
      //unapply is invoked
      case _ => println("i cannot calculate")
    }
  }
  def apply(x: Int) = x*2
  def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
}
