package com.scala.function

/**
  * Created by Administrator on 2016/7/12.
  * 修饰符说明
  * 私有成员
  * 受保护的成员
  * 公共成员--默认
  */
class Outer{
  class Inner{
    private def fun1(){println("fun1")}
    def fun2(){println("fun2")} //默认的是public
    class InnerMost{
      fun1()  //可以调用
    }
  }
//  (new Inner).fun1 //不能调用
  (new Inner).fun2
}
//受保护的成员 只能从子类访问
package p1{
  class Super{
    protected def fun1() = "fun1"
  }
  class Sub extends Super{
    fun1()
    def fun2 = fun1()
  }
  class Other{
//    (new Super).fun1 //不可访问
//    (new Sub).fun1  //不可访问
    (new Sub).fun2
  }
}
