package com.scala.objectClass

/**
  * Created by Administrator on 2016/7/11.
  */
class Student(override val id:Int,override val name:String,override val age:Int,val sno:Int) extends  User(id,name,age){
  var usno = sno

  override def printInfo(): Unit ={
    println("id:"+uid+" name:"+uname+" age:"+uage+" sno:"+usno)
  }
}