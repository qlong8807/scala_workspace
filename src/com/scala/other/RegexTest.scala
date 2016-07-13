package com.scala.other

import scala.util.matching.Regex

/**
  * Created by Administrator on 2016/7/11.
  */
object RegexTest {
  def main(args: Array[String]) {
    val pattern = "scala".r
    val pattern1 = new Regex("(S|s)cala")
    val str = "Scala is scalable and cool"

    println("old string is:"+str)
    println(pattern.findFirstIn(str))
    println(pattern findFirstIn str)
    println(pattern1.findAllIn(str).mkString(","))
    println(pattern1.replaceFirstIn(str,"java"))
  }
}
