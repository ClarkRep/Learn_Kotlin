package com.clark.learn.kotlin.chapter2

/**
 * @author Clark
 * @description
 * 2.6、空类型和智能类型转换
 *
 * 2.6.1、空类型安全
 * * ? 表示定义的变量可空；
 * * ?: 表示如果变量为不空，那么执行后面的语句；如果为空，返回null；
 * * !!. 强制认定变量不为空，直接执行后面的语句。
 *
 * 2.6.2、智能类型转换
 * * is 和 java的 instance 作用一样，是用来判断类型的，只不过kotlin判断类型之后，不需要再进行强转就可以调用目标类型的方法了；
 * * as 和 java的强转一样，如果类型不匹配，则会抛出类型转换异常；
 * * as? 相对于 as，as？是安全的类型转换，如果类型不匹配，只会转换为null，不会抛出异常。
 * @date 2019/3/5
 */


fun main() {

//    testNullSafe()

    testClassCast()

}

fun getNotNullName(): String {
    return "小明"
}

fun getNullableName(): String? {
    return null
}

fun testNullSafe() {

    //定义一个不可空的字符串变量
    val notNullName: String = getNotNullName()
    println(notNullName)
    println("notNullName：$notNullName")
    //非空的字符串可以直接获取长度
    println("notNullName 长度：${notNullName.length}")

    //定义一个可空的字符串变量
    val nullableName: String? = getNullableName()
    println("nullableName：$nullableName")

    //nullableName可能为空，不能直接获取长度，使用 ?. 可进行非空安全校验，如果为空，返回null。
    println("nullableName 长度：${nullableName?.length}")

    // ?: 表示如果nullable不为空，那么返回nullableName，如果为空，则返回 ?: 后面的数据。
    println("nullableName?:${nullableName ?: "为空啦"}")

    //强制认定 nullableName 不为空，如果为空，则抛出异常：KotlinNullPointerException
    println(nullableName!!.length)

}

open class Parent

class Child : Parent() {

    fun logChild(): String {
        return "我是 Child 的方法"
    }

}

fun testClassCast() {
    val parent: Parent = Child()

    //智能类型转换
    if (parent is Child) {
        //因为前面已经判断了 parent 是 Child 类型了，所以不需要进行类型转换就可以调用 Child 的方法了。
        println(parent.logChild())
    }

    // as 强制类型转换为Child，如果类型转换失败，则抛异常 ClassCastException。
//    val parent2 = Parent()
//    val sub2 = parent2 as Child
//    sub2.logChild()

    // as? 安全的类型转换，如果类型转换失败，则转换为null。
    val parent3 = Parent()
    val sub3 = parent3 as? Child
    println(sub3?.logChild())
}