package com.scala.objectClass

/**
  * Created by Administrator on 2016/7/11.
  */
object UserTest {
  def main(args: Array[String]) {
    val u = new User(1,"zhang",22)
    println(u.toString)

    val s = new Student(1,"zhang",22,88)
    s.printInfo()
  }
}
