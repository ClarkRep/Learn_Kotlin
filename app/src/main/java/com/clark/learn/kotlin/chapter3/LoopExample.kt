package com.clark.learn.kotlin.chapter3

/**
 * @author Clark
 * @description 3.7、循环语句（for循环，while循环，continue，break）
 *
 * @date 2019/3/16
 */

fun main() {
//    testForLoop()
//    testIterator()
//    testWhile()
    testBreakAndContinue()
}

/**
 * for循环
 */
fun testForLoop() {
    val array = arrayOf("a", "b", "c", "d")
    for ((index, value) in array.withIndex()) {
        println("$index -> $value")
    }
}

fun testIterator() {
    val list = MyList()
    list.add(1)
    list.add(2)
    list.add(3)
    for (i in list) {
        println(i)
    }
}

/**
 * 自定义一个迭代器
 */
class MyIterator(val iterator: Iterator<Int>) {

    operator fun next(): Int {
        return iterator.next()
    }

    operator fun hasNext(): Boolean {
        return iterator.hasNext()
    }
}

/**
 * 自定义一个类使用自定义的迭代器
 */
class MyList {

    private val list = ArrayList<Int>()

    fun add(int: Int) {
        list.add(int)
    }

    fun remove(int: Int) {
        list.remove(int)
    }

    operator fun iterator(): MyIterator {
        return MyIterator(list.iterator())
    }
}

fun testWhile() {
    var i = 0

    do {
        println(i)
        i++
    } while (i < 10)

    while (i < 10) {
        println(i)
        i++
    }
}

fun testBreakAndContinue() {
    val array = arrayOf(1, 2, 3, 4, 5)
    //外层for循环定义个别名
    Outter@ for (i in array) {
        if (i == 3) {
            continue
        }
        Inner@ while (i == 4) {
            break@Outter
        }
        println(i)
    }
}