package com.scala.collections

/**
  * Created by Administrator on 2016/7/11.
  * 需要注意迭代器的部分方法执行后，就会结束迭代器（清空迭代器中的元素）
  */
object IteratorTest {
  def main(args: Array[String]) {
    val it = Iterator("abc","def","ght","mmn","xyz")
    while (it.hasNext){
      print("  "+it.next())
    }
    println()
    val it2=Iterator(1,423,32,5,2,3,6,99,345,7745)
//    println("it.min:"+it2.min)
//    println("it.max:"+it2.max)
    println("it.size:"+it2.size)
    println("it.length:"+it2.length)
  }
}
