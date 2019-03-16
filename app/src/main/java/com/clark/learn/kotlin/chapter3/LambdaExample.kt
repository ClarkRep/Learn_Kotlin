package com.clark.learn.kotlin.chapter3

/**
 * @author Clark
 * @description 3.3 Lambda表达式
 * @date 2019/3/6
 */


fun main() {
    val strArray = arrayOf("我", "爱", "Kotlin")

//    testForEach(strArray)

    testReturnForEach(strArray)


    println(lambdaIntToLong(1))

    println()
}

fun testForEach(strArray: Array<String>) {

    for (str in strArray) println(str)

    strArray.forEach({ println(it) })

    strArray.forEach() { println(it) }

    strArray.forEach { println(it) }

    strArray.forEach(::println)
}

fun testReturnForEach(strArray: Array<String>) {
    strArray.forEach FOREACH@{
        if (it == "Kotlin") {
            printHello()
            //如果直接return，相当于这个方法就return结束了，想跳出当前for循环，给for循环起个别名@FOREACH，然后 return@FOREACH 即可跳出该for循环。
            return@FOREACH
        }
        println(it)
    }

    println("function end")
}

fun printHello() {
    println("Hello")
}

/**
 * Int类型的值不能直接用Long进行接收。
 */
fun intToLong(arg: Int): Long {
    return arg.toLong()
}

var lambdaIntToLong = { arg: Int -> arg.toLong() }