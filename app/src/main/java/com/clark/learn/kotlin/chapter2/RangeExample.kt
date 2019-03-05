package com.clark.learn.kotlin.chapter2

/**
 * @author Clark
 * @description
 * 2.8、 区间（Range）
 *
 * @date 2019/3/5
 */

val range: IntRange = 0..100    //[0,100]
val range_exclusive: IntRange = 0 until 100  //[0,100)

val emptyRange: IntRange = 0 until -1    //空

fun main() {

    println(range.contains(50))

    println(50 in range_exclusive)

    println(emptyRange.isEmpty())

    for (i in range_exclusive) {
        print("$i,")
    }
}