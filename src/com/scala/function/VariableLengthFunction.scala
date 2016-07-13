package com.scala.function

/**
  * Created by Administrator on 2016/7/12.
  * 变长参数+参数限定
  */
object VariableLengthFunction {
	def main(args: Array[String]) {
		println("求和:" + sum(1, 2, 3, 4, 5))
		println("求和:" + sum(1))
		println("求和:" + sum())
	}

	def sum(nums: Int*) = {
		require(nums.size > 0, "input must > 0!")//参数限定
		nums reduceLeft ((x: Int, y: Int) => x + y)
	}
}
