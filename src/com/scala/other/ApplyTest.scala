package com.scala.other

/**
  * 用括号传递给变量(对象)一个或多个参数时，Scala 会把它转换成对 apply 方法的调用；
  * 与此相似的，当对带有括号并包括一到若干参数的进行赋值时，
  * 编译器将使用对象的 update 方法对“括号里的参数和等号右边的值”执行调用。
  *
  * 1. theArray(0), 取数组的第一个元素的操作会转换成 theArray.apply(0) 操作，
  * 这也能解释为什么 Scala 数组取值不用中括号括下标的方式，因为它也是一次方法调用
  * 2. anyObject("key1") 会被转换成 anyObject.apply("key") 操作
  * 3.在构造 Array 或  Map 时，会简单的写成val nums =Array("zero","one","two")
  * 其实这是调用了Array的 apply方法，即：val nums =Array.apply("zero","one","two")
  */
object ApplyTest {
	def main(args: Array[String]) {
		val test = new MyEmail
		println(test("123", "facebook.com"))
		println(test(1,5))

		//使用update 时，等号右边的值会作为 update 方法的最后一个参数
		println(test(111, "ccc") = 456)
		println(test("aaa", "ccc") = "bbb")

		val x = 8
		x match
		{
			case ApplyTest(num) => println(x+" is bigger two times than "+num)
			//unapply is invoked
			case _ => println("i cannot calculate")
		}

	}
	def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None

}

class MyEmail {
	def apply(name: String, domain: String) = {
		println("apply method was called...")
		name + "@" + domain
	}
	def apply(a:Int,b:Int) = {
		println("apply int method was called...")
		a+b
	}
	def update(a: Int, str: String, b: Int) = {
		println("update method was called...")
		a + "||" + str + "||" + b
	}
	def update(a: String, str: String, b: String) = {
		println("update string method was called...")
		a + "||" + str + "||" + b
	}
	def unapply(email: String): Option[(String, String)] = {
		//    val str = email.split("@")
		val str = email split "@"
		if (2 != str.length) {
			None
		} else {
			Some(str(0), str(1))
		}
	}
}