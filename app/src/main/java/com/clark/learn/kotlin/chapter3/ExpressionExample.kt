package com.clark.learn.kotlin.chapter3

/**
 * @author Clark
 * @description 3.6 表达式（中缀表达式，分支表达式，when表达式）
 * @date 2019/3/15
 */

private const val USERNAME = "kotlin"
private const val PASSWORD = "123456"

private const val ADMIN_USER = "admin"
private const val ADMIN_PASSWORD = "admin"

private const val MODE_DEBUG = "1"
private const val MODE_RELEASE = "2"


fun main() {
//    ifExpression("1")

    whenExpression()
}

/**
 * if 表达式
 */
fun ifExpression(model: String) {

    println("请输入用户名：")
    val username = readLine()

    println("请输入密码：")
    val password = readLine()

    val result: String

    //if 表达式可以有返回值
    result = if (model == MODE_DEBUG && username == ADMIN_USER && password == ADMIN_PASSWORD) {
        "成功"
    } else if (username == USERNAME && password == PASSWORD) {
        "成功"
    } else {
        "失败"
    }
    println("登陆$result")
}

fun whenExpression() {

    val arg = 10

    when (arg) {
        11 -> println("$arg == 11")
        in 0..10 -> println("$arg in 0..10")
        !in 0..10 -> println("$arg !in 0..10")
        else -> println("所有条件都不满足")
    }

}