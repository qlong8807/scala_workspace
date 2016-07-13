package com.scala.function

/**
  * Created by Administrator on 2016/7/12.
  * 闭包
  * 函数及其执行所需的上下文环境
  * (“An object is data with functions. A closure is a function with data.” — John D. Cook)
  */
object ClosureTest {
	def main(args: Array[String]) {
		val f = fun()
		println(fun()())
		println(fun()())
		println(f())
		println(f())
		println(f())
		println(f())
	}
	def fun()={
		var i = 0
		val lam = () => {i+=1;i}
		lam
	}
}
