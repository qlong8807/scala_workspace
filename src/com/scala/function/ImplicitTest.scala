package com.scala.function

/**
  * Created by Administrator on 2016/7/12.
  * 隐式转换函数是指在同一个作用域下面，一个给定输入类型并自动转换为指定返回类型的函数，
  * 这个函数和函数名字无关，和入参名字无关，只和入参类型以及返回类型有关。注意是同一个作用域。
  *
  * 记住隐式转换函数的同一个scop中不能存在参数和返回值完全相同的2个implicit函数。
  * 隐式转换函数只在意 输入类型，返回类型。
  * 隐式转换是scala的语法灵活和简洁的重要组成部分
  */
object ImplicitTest {
	def displayString(str:String) = println(str)
	implicit def convertInt(i:Int) = i.toString
	implicit def booleanConvert(b:Boolean) = if(b) "true" else "false"

	def main(args: Array[String]) {
		ImplicitTest displayString "test"
		displayString("abc")
		displayString(123)
		displayString(false)

		Param.print("jack")("hello")
		import Context._
		Param.print("jack")
	}
	object Context{
		implicit val ccc:String = "implicit"
	}
	object Param{
		def print(content:String)(implicit prefix:String){
			println(prefix+":"+content)
		}
	}

}
