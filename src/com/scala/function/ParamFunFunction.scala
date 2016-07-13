package com.scala.function

/**
  * Created by Administrator on 2016/7/7.
  */
object ParamFunFunction {
	def main(args: Array[String]) {
		delayed(time())
	}

	def time() = {
		println("get a nano time")
		System.nanoTime()
	}

	def delayed(t: => Long) = {
		println("go in delayed")
		println("Param is: " + t)
		t
	}

}
