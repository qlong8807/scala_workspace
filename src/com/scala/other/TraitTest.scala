package com.scala.other

/**
  * Created by Administrator on 2016/7/11.
  * 多个类都具有的特性，可以写成一个特质
  */
object TraitTest {
  def main(args: Array[String]) {
    val b1 = new Book("计算机",199)
    val b2 = new Book("化学",399)
    val b3 = new Book("计算机",299)
    println("b1 equals b2:"+b1.isEqual(b2))
    println("b1 notequals b2:"+b1.isNotEqual(b2))
    println("b1 equals 2:"+b1.isEqual(199))

  }
}
trait Equal{
  def isEqual(x:Any) : Boolean
  def isNotEqual(x:Any):Boolean = !isEqual(x)

}
class Book(name:String,price:Int) extends Equal{
  var uname = name
  var uprice = price
  def isEqual(x:Any): Boolean ={
    x.isInstanceOf[Book] && x.asInstanceOf[Book].uname == uname
  }
}
