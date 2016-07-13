package com.scala.collections

/**
  * 默认情况下，Scala中使用不可变的映射。如果想使用可变集，必须明确地导入scala.collection.mutable.Map类。
  */
object MapsTest {
	def main(args: Array[String]) {
		val colors = Map("red" -> "#FF0000",
			"azure" -> "#F0FFFF",
			"peru" -> "#CD853F")
		val nums: Map[Int, Int] = Map()
		println("Keys in colors : " + colors.keys)
		println("Values in colors : " + colors.values)
		println("Check if colors is empty : " + colors.isEmpty)
		println("Check if nums is empty : " + nums.isEmpty)
		//串联
		val colors1 = Map("red" -> "#FF0000",
			"azure" -> "#F0FFFF")
		val colors2 = Map("blue" -> "#0033FF",
			"yellow" -> "#FFFF00")
		// use two or more Maps with ++ as operator
		var colorss = colors1 ++ colors2
		println("colors1 ++ colors2 : " + colorss)
		// use two maps with ++ as method
		colorss = colors1.++(colors2)
		println("colors1.++(colors2)) : " + colorss)
		colorss.keys.foreach { i => print("key=" + i)
			print(" value=" + colorss(i))
		}
		println()
		println("get---" + colors.get("red"))
	}
}
