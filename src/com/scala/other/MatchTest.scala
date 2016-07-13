package com.scala.other

/**
  * Created by Administrator on 2016/7/11.
  * case
  * case classes
  */
object MatchTest {
  def main(args: Array[String]) {
    println("matchtest1  1:"+matchtest1(1))
    println("matchtest1  2:"+matchtest1(2))
    println("matchtest1  2.3:"+matchtest1(2.3))
    println("matchtest1  two:"+matchtest1("two"))
    println("matchtest1  test:"+matchtest1("test"))
    println("matchtest2  1:"+matchtest2(1))
    println("matchtest2  2:"+matchtest2(5))
    println("matchtest2  two:"+matchtest2("two"))
    println("matchtest2  test:"+matchtest2("test"))

    //test case class
    val tom = new Person("tom",33)
    val steven = new Person("steven",35)
    val jans = new Person("jans",28)
    for (person <- List(tom,steven,jans)){
      person match {
        case Person("tom",33) => println("hi,tom:"+person)
        case Person("steven",35) => println("hi,steven:"+person)
        case Person("jans",28) => println("hi,jans:"+person)
      }
    }
  }
  def matchtest1(x:Any):Any = {
    x match {
      case 1 => "one"
      case "two" => 2
      case y:Int => "scala.Int"
      case _ => "many"
    }
  }
  def matchtest2(x:Any) :Any = x match {
    case 1 => "one"
    case "two" => 2
    case y:Int => "scala.Int"
    case _ => "many"
  }

  //case class
  case class Person(name:String,age:Int)
}
