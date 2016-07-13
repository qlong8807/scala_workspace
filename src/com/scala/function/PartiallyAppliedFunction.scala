package com.scala.function

import java.util.Date

/**
  * Created by Administrator on 2016/7/12.
  */
object PartiallyAppliedFunction {
  def main(args: Array[String]) {
    //部分应用函数
    val logWithMsg = log(_: Date, "this is message")
    logWithMsg(new Date())
    Thread.sleep(1000)
    logWithMsg(new Date())
  }
  def log(date: Date, msg: String) = {
    println(date + "---" + msg)
  }
}
