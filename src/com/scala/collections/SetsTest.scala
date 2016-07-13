package com.scala.collections

/**
  * 默认情况下，Scala中使用不可变的集。如果想使用可变集，必须明确地导入scala.collection.mutable.Set类。
  * head	此方法返回集合的第一个元素。
  * tail	该方法返回集合由除第一个以外的所有元素。
  * isEmpty	如果设置为空，此方法返回true，否则为false。
  */
object SetsTest {
	def main(args: Array[String]) {
		//集合定义和方法
		val fruit = Set("apples", "oranges", "pears")
		fruit.addString(new StringBuilder("banana"))
		val nums: Set[Int] = Set()
		println("Head of fruit : " + fruit.head)
		println("Tail of fruit : " + fruit.tail)
		println("Check if fruit is empty : " + fruit.isEmpty)
		println("Check if nums is empty : " + nums.isEmpty)
		//集合合并
		val fruit1 = Set("apples", "oranges", "pears")
		val fruit2 = Set("mangoes", "banana")
		// use two or more sets with ++ as operator
		var fruits = fruit1 ++ fruit2
		println("集合合并 fruit1 ++ fruit2 : " + fruits)
		// use two sets with ++ as method
		fruits = fruit1.++(fruit2)
		println("集合合并 fruit1.++(fruit2) : " + fruits)

		val num = Set(5, 6, 9, 20, 30, 45)
		// 查找集合最大值和最小值
		println("最小值 Min element in Set(5,6,9,20,30,45) : " + num.min)
		println("最大值 Max element in Set(5,6,9,20,30,45) : " + num.max)
		val num1 = Set(5, 6, 9, 20, 30, 45)
		val num2 = Set(50, 60, 9, 20, 35, 55)
		// 查找集合的交集
		println("集合的交集num1.&(num2) : " + num1.&(num2))
		println("集合的交集num1.intersect(num2) : " + num1.intersect(num2))

		//定义可变集合
		var iset = scala.collection.mutable.Set(1,2,3)
		iset.add(1)
		iset.add(5)
		iset.remove(1)
		iset -= 2
		iset += 6
		println("可变集合类型："+iset.getClass.getName)
		println("可变set:"+iset)
		print("遍历：")
		iset.foreach(x=>print(x+" "))
		println()
		val jset = iset.toSet
		println("转为不可变集合："+jset.getClass.getName)
		print("使用iterator取值：")
		val it = jset.iterator
		while (it.hasNext)
			print(it.next()+" ")
		println()
	}
}
