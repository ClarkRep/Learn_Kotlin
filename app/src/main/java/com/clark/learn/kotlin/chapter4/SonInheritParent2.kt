package com.clark.learn.kotlin.chapter4

/**
 * @author Clark
 * @description 4.3、子承父类 - 继承2
 * @date 2019/3/18
 */

interface TestA {
    fun getX(): Int = -10
}

interface TestB {
    fun getX(): Int = 10
}

abstract class TestC {
    open fun getX(): Int = 110
}

class TestD(val y: Int) : TestC(), TestA, TestB {
    override fun getX(): Int {
        if (y < 0) {
            return super<TestA>.getX()
        } else if (y < 100) {
            return super<TestB>.getX()
        } else if (y < 200) {
            return super<TestC>.getX()
        }
        return 1000
    }
}

fun main() {
    println(TestD(-1).getX())
    println(TestD(11).getX())
    println(TestD(111).getX())
    println(TestD(1111).getX())
}