package com.scala.other

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * Created by Administrator on 2016/7/11.
  */
object ExceptionTest {
  def main(args: Array[String]) {
    try{
      val file = new FileReader("read.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("missing file exception")
      }
      case ex:IOException => {
        println("has io excpetion")
      }
    }finally {
      println("this statement will always execute")
    }
  }
}
