package com.clark.learn.kotlin.chapter2

/**
 * @author Clark
 * @description
 * 2.3、Char类型：
 * * 字符对应 Java 的 Character；
 * * 占两个字节，表示一个16位的 Unicode 字符；
 * * 字符用单引号 '' 引起来，例如：'a','0','\n'
 * @date 2019/3/4
 */

fun main() {
    val aChar:Char = '0'
    val otherChar:Char = 'a'
    val moreChar:Char = '\u000f'

    println(aChar)
    println(otherChar)
    println(moreChar)
}