package com.scala.collections

/**
  * Scala的元组结合件多个固定数量在一起，使它们可以被传来传去作为一个整体。
  * 不像一个数组或列表，元组可以容纳不同类型的对象，但它们也是不可改变的。
  */
object TupleTest {
  def main(args: Array[String]) {
    //定义
    val t1 = (1, "hello", Console)
    val t2 = new Tuple3(1, "hello", Console)
    val t = (4,3,2,1)
    val sum = t._1 + t._2 + t._3 + t._4
    println( "Sum of elements: "  + sum )
    //遍历
    t.productIterator.foreach{ i =>println("Value = " + i )}
    //tostring
    println("转换为 String: " + t.toString() )
    //交换
    val tu1 = new Tuple2("Scala", "hello")
    println("origin Tuple: " + tu1 )
    println("Swapped Tuple: " + tu1.swap )


  }
}
