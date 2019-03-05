package com.clark.learn.kotlin.chapter2

/**
 * @author Clark
 * @description
 * 2.2、Number类型:
 * 1. 浮点型 Double（64位）、Float（32位）
 * 2. 整型 Long（64位）、Int（32位）、Short（16位）
 * 3. 字节 Byte（8位）
 *
 * Kotlin 的 Number 数据类型对比 Java 的，将拆装箱合为一体，没有具体的区分拆箱和装箱。
 *
 * @date 2019/3/4
 */

fun main() {

//    testInt()

//    testLong()

//    testDouble()

//    testShort()

    testByte()
}

fun testInt() {
    val maxInt: Int = Int.MAX_VALUE
    val minInt: Int = Int.MIN_VALUE

    //Int 的最大值和最小值
    println(maxInt)
    //Int 的最大值是 2的31次方减1
    println(Math.pow(2.0, 31.0) - 1)

    println(minInt)
    //Int 的最小值是：负的2的31次方
    println(-Math.pow(2.0, 31.0))

    //Int 的十进制写法
    val aInt = 127
    //Int 的十六进制写法
    val anotherInt = 0XFF
    //Int 的二进制写法
    val moreInt = 0b0000011

    println(aInt)
    println(anotherInt)
    println(moreInt)
}

fun testLong() {
    val aInt: Int = 123
    //Kotlin 基本数据类型的转换，不可隐式抓换。
    val aLong: Long = aInt.toLong()
    println(aLong)

    val maxLong: Long = Long.MAX_VALUE
    val minLong: Long = Long.MIN_VALUE

    println(maxLong)
    println(minLong)
}

fun testDouble() {
    val maxDouble: Double = Double.MAX_VALUE
    val minDouble: Double = Double.MIN_VALUE

    println(maxDouble)
    println(minDouble)
    //Double的最小值并不是Double.MIN_VALUE，而是 -Double.MAX_VALUE
    println(-Double.MAX_VALUE)
}

fun testShort() {
    val maxShort: Short = Short.MAX_VALUE
    val minShot: Short = Short.MIN_VALUE

    println(maxShort)
    println(minShot)
}

fun testByte() {
    val maxByte: Byte = Byte.MAX_VALUE
    val minByte: Byte = Byte.MIN_VALUE

    println(maxByte)
    println(minByte)
}