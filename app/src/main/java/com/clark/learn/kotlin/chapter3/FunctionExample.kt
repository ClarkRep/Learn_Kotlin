package com.clark.learn.kotlin.chapter3

/**
 * @author Clark
 * 3.2、函数（function）
 * @description
 * @date 2019/3/6
 */

fun main(): Unit {

    println("1 + 2 = ${sum(1, 2)}")
    println("result = ${result(1, 2)}")

}

fun sum(arg1: Int, arg2: Int) = arg1 + arg2

var result = fun(arg1: Int, arg2: Int) = arg1 + arg2