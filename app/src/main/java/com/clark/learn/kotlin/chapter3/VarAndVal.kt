package com.clark.learn.kotlin.chapter3

/**
 * @author
 * @description
 * 3.1、变量与常量
 * @date 2019/3/5
 */

val FINAL_HELLO_WORLD:String = "HelloWorld"

var helloWorld:String = FINAL_HELLO_WORLD

const val FINAL_HELLO_CHINA = "HelloChina"  //常量

var helloChina = FINAL_HELLO_CHINA  //类型推导

fun main(args:Array<String>) {
    println(args[0]+args[1])
}