package com.scala.collections

/**
  * list操作
  */
object ListTest {
	def main(args: Array[String]) {
		val fruit1: List[String] = List("apples", "oranges", "pears")
		val fruit2 = "apples" :: ("oranges" :: ("pears" :: Nil))
		println("fruit1:" + fruit1)
		println("fruit2:" + fruit2)
		println("fruit1 ::: fruit2:" + (fruit1 ::: fruit2))
		println("fruit1.::: fruit2:" + (fruit1.:::(fruit2)))
		println("fruit1.:: fruit2:" + (fruit1.::(fruit2)))

		// Creates 5 elements using the given function.
		val squares = List.tabulate(6)(n => n * n)
		println("squares : " + squares)
		val mul = List.tabulate(4, 5)(_ * _)
		println("mul : " + mul)

		val num = List.fill(10)(2) // Repeats 2, 10 times.
		for (i <- num) {
			print(" " + i)
		}
	}
}
