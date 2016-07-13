package com.scala.function

/**
  * Created by Administrator on 2016/7/12.
  * 传名参数
  */
object CallByNameFunction {
	def main(args: Array[String]) {
		printInt(1,2)
		printInt(b=3,a=5)
	}

	def printInt(a: Int, b: Int): Unit = {
		println("a :" + a + "	b :" + b)
	}
}
