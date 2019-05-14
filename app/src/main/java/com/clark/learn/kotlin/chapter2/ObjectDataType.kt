package com.clark.learn.kotlin.chapter2

/**
 * @author Clark
 * @description
 * 2.5、类和对象：
 * 类的继承
 * * 默认类是 final 修饰的，如果想要某个类可以被继承，那么需要在 class 前面加上 open 关键字；
 * * 提取多个类的共性得到一个更抽象的类，即父类；
 * * 子类拥有父类的一切特征；
 * * 子类也可以自定义自己的特征；
 * * 所有类都最终继承自 Any。
 * @date 2019/3/5
 */

class Girl constructor(name: String, age: Int, price: Double) : People(name, age, price)

class Boy constructor(name: String, age: Int, price: Double) : People(name, age, price)

open class People constructor(var name: String, var age: Int, var price: Double) {
    init {
        println("new 了一个${this.javaClass.simpleName}，ta叫：$name，年龄：$age，收入：$price")
    }
}

class Other : People {

    constructor() : super("", 0, 0.0)

    constructor(name: String, age: Int) : super(name, age, 0.0)

    constructor(name: String, age: Int, price: Double) : super(name, age, price)

}

fun main() {
    val girl: Girl = Girl("Lucy", 12, 100.0)
    val boy: Boy = Boy("Davi", 13, 120.0)

    val other: Other = Other()

}