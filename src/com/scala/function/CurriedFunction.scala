package com.scala.function

/**
  * Created by Administrator on 2016/7/12.
  */
object CurriedFunction {
	def main(args: Array[String]) {
		println("柯里函数：a+b:" + strcat("a")("b"))
	}

	/**
	  * 柯里函数
	  */
	def strcat(s1: String)(s2: String) = {
		s1 + s2
	}
}
