package com.scala.collections

/**
  * Created by Administrator on 2016/7/8.
  */
object ArrayTest {
  def main(args: Array[String]) {
    printf("%s测试:","数组")
    println()
    //数组
    var arr: Array[Int] = Array(1, 2, 3, 4)
    for (i <- arr) {
      print(" " + i)
    }
    println()
    var arr2 = Range(10, 20, 2)
    for (i <- arr2) {
      print(" " + i)
    }
  }
}
