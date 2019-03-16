package com.clark.learn.kotlin.chapter3

/**
 * @author Clark
 * @description 3.4 类成员（成员方法、成员变量）
 * @date 2019/3/15
 */

class X

class A {
    var b = 0

    /**
     * lateinit 暂时不初始化
     */
    lateinit var c: String

    /**
     *
     */
    val x: X by lazy {
        println("lazy 被执行了")
        X()
    }

}

fun main() {

    var a = A()

    println("a.b = ${a.b}")

    println("a.c = ${a.c ?: "为空啦"}")

    println("x = ${a.x}")
}
