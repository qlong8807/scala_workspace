package com.scala.function

import scala.util.control.Breaks

/**
  * Created by Administrator on 2016/7/12.
  */
object BreakTest {
	def main(args: Array[String]) {
		val nums = List(1,2,3,4,5,6)
		val strs = Set("a","b","c")
		val outer = new Breaks
		val inner = new Breaks
		outer.breakable(
			for(a <- nums){
				if(a>4) outer.break()
				println("a is:"+a)
				inner.breakable(
					for (b <- strs){
						if("b".eq(b) || "c".eq(b))
							inner.break
						println("b is:"+b)
					}
				)
			}
		)
	}
}
