package com.scala.collections

/**
  * Created by Administrator on 2016/7/11.
  */
object OptionsTest {
  def main(args: Array[String]) {
    val a:Option[Int] = Some(5)
    val b:Option[Int] = None
    println("a.getOrElse(0): " + a.getOrElse(0) )
    println("b.getOrElse(10): " + b.getOrElse(10) )

    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
    println("show(capitals.get( \"Japan\")) : " + show(capitals.get( "Japan")))
    println("show(capitals.get( \"India\")) : " + show(capitals.get( "India")))
    println("b.isEmpty:"+b.isEmpty)
    println("b.orNull:"+b.orNull)
    println("a.isDefined:"+a.isDefined)
    println("b.isDefined:"+b.isDefined)
//    println("b.orNull:"+b.orElse())


  }
  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }
}
