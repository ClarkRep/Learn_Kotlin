package com.clark.learn.kotlin.chapter2

/**
 * @author Clark
 * @description
 * 2.9 数组（Array）
 * @date 2019/3/5
 */

val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val charArray: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val stringArray: Array<String> = arrayOf("你", "好", "HelloWorld")

fun main() {
    for (i in intArray) {
        print("$i,")
    }

    println()

    println(charArray.joinToString(""))

    stringArray[0] = "我"

    for (str in stringArray) {
        print(str)
    }
    println()

    val str: String = "你好HelloWorld"
    println(str.slice(0 until str.length))
    println(str.slice(0..str.length))   //角标越界

}