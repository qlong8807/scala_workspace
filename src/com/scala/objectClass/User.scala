package com.scala.objectClass

/**
  * Created by Administrator on 2016/7/11.
  */
class User (val id:Int,val name:String,val age:Int){
  var uid = id
  var uname = name
  var uage = age

  def  printInfo(): Unit ={
    println("id:"+uid+" name:"+uname+" age:"+uage)
  }

  override def toString = s"User($uid, $uname, $uage)"
}
