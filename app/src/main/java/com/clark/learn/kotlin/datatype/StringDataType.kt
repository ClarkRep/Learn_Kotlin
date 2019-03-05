package com.clark.learn.kotlin.datatype

/**
 * @author Clark
 * @description
 * 2.4、字符串
 * 1、字符串就是一串 char ；
 * 2、kotlin 中的 == 与 Java 的 equals 是等价的；
 * 3、kotlin 如果想比较两个对象是否相等，使用 === 。
 * @date 2019/3/4
 */

val string: String = "HelloWorld"
val fromChar: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))

fun main() {
    println(string)
    println(fromChar)

    //kotlin 中的 == 与 Java 的 equals 是等价的；
    println("string == fromChar:${string == fromChar}")
    //kotlin 如果想比较两个对象是否相等，使用 ===
    println("string === fromChar:${string === fromChar}")

    //kotlin 使用 $ 符进行引用和占位，也可以使用 ${} 进行运算
    val arg1: Int = 1
    val arg2: Int = 2

    println("$arg1+$arg2=${arg1 + arg2}")

    //如果我们想要打印 $ 符号，需要进行转义
    val money: Int = 1000
    println("\$$money")

    //如果我们想要打印原始字符串，那么使用一对三个引号包裹起来的就可以了
    val rawString = """\\\\\\$$money
        \n
        \t"""
    println(rawString)
}