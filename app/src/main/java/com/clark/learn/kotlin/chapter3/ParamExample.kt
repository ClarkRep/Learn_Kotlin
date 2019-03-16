package com.clark.learn.kotlin.chapter3

/**
 * @author Clark
 * @description 3.9、具名参数，变长参数，默认参数
 * @date 2019/3/16
 */

fun main() {

    val sum = { arg1: Int, arg2: Int -> arg1 + arg2 }
    println(sum(1, 2))

    //使用具名参数的方式来调用一个方法，因为是具名参数，所以调换两个参数的位置也不影响结果。
    println(getSum(arg2 = 1, arg1 = 2))

    //调用变长参数，如果有歧义的，需要使用具名参数来指定某个参数的值
    paramTest(1, 2, 3, 4, double = 5.0)

    //调用默认参数，如果默认参数没有传值，可以使用具名参数的方式。
    paramDefault(arg2 = 10)
}

/**
 * 定义一个方法，使用具名参数的方式来调用。
 */
fun getSum(arg1: Int, arg2: Int): Int {
    return arg1 - arg2
}

/**
 * 变长参数
 * * 在java中，变长参数只能在方法参数的最后一个位置；
 * * 在kotlin中，因为有具名参数，所以变长参数可以放在参数列表的任何位置；
 * * 如果传参的时候有歧义，要使用具名参数来指定。
 */
fun paramTest(vararg ints: Int, double: Double) {
    ints.forEach(::println)
    println(double)
}

/**
 * 默认参数
 */
fun paramDefault(arg1: Int = 10, arg2: Int) {
    println("paramDefault = ${arg1 + arg2}")
}