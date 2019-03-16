package com.clark.learn.kotlin.chapter3

/**
 * @author 3.8、异常捕获（try，catch，finally）
 * @description
 * @date 2019/3/16
 */
fun main() {

//    testTryCatch()

    testFinaly()
}

fun testTryCatch() {

    val array = arrayOf("1", "2a")

    try {
        var arg1 = array[0].toInt()
        var arg2 = array[1].toInt()
        println("arg1 + arg2 = ${arg1 + arg2}")
        var arg3 = array[2].toInt()
        println("arg3 = $arg3")
    } catch (e: NumberFormatException) {
        println("类型转换异常了")
    } catch (e: IndexOutOfBoundsException) {
        println("角标越界异常")
    } catch (e: Exception) {
        println("未知异常")
    }
}

/**
 * finally 无论代码是否抛出异常都会执行
 */
fun testFinaly() {
    val array = arrayOf("1", "2a")

    val result = try {
        val arg = array[1]
        println(arg)
        arg
    } catch (e: Exception) {
        e.printStackTrace()
        array[0]
    } finally {
        //1、无论代码是否抛出异常，都会执行finally的代码，
        //2、如果抛出异常了，会先执行finally里面的代码，然后返回catch里面的值。
        println("finally 执行了")
    }

    println(result)
}