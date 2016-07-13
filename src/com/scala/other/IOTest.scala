package com.scala.other

import java.io.{File, PrintWriter}

import scala.io.Source
import scala.util.control.Breaks._
//import scala.util.control.Breaks

/**
  * Created by Administrator on 2016/7/11.
  */
object IOTest {
  def main(args: Array[String]) {
    println("wirte string to file begin")
    val wfile = new PrintWriter(new File("test.txt"))
    wfile.write("这是程序输入的字符串\n")
    //从屏幕读取一行
    println("请输入想要保存的字符串（输入quit完成输入）：")
//    val bk = new Breaks;
    breakable{
      while (true){
        var console = Console.readLine
        if ("quit" equals console) break()
          wfile.write(console+"\n")
      }
    }

    wfile.close()
    println("write string to file finished")

    println("the file content is:")
    Source.fromFile("test.txt").foreach{
      print
    }

  }
}
