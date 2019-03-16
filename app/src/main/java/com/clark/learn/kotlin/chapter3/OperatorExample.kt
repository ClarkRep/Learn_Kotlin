package com.clark.learn.kotlin.chapter3

/**
 * @author Clark
 * @description 3.5 基本运算符
 * @date 2019/3/15
 */

/**
 * 运算符：+ - * / % ^ ?
 *
 * 重载父类的基本运算符
 * 1、任务类可以定义或者重载父类的基本运算符；
 * 2、通过运算符对应的具名函数来定义；
 * 3、对参数个数作要求，对参数和返回值类型不作要求；
 * 4、不能像 Scala 一样定义任意运算符，只能重载上面的运算符后面的哪几种运算符。
 */
class Complex(var real: Double, var imaginary: Double) {

    operator fun plus(complex: Complex): Complex {
        return Complex(real + complex.real, imaginary + complex.imaginary)
    }

    operator fun plus(arg1: Int): Int {
        return (real + arg1).toInt()
    }

    operator fun plus(arg1: Any) {
        println("我是没有返回值的plus")
    }

    override fun toString(): String {
        return "real:$real ,imaginary:$imaginary"
    }


    operator fun invoke(): Double {
        //取模
        return Math.hypot(real, imaginary)
    }
}

class Book {
    //自己定义一个类似 in 的中缀表达式，DSL
    infix fun on(desk: Desk): Boolean {
        return true
    }
}

class Desk

fun main() {

    val a = Complex(3.0, 4.0)
    val b = Complex(4.0, 5.0)
    println("${(a + b)} ")

    println("a + 10 = ${(a + 10)}")

    a.plus(Any())

    println("a() = ${a()}")


    //中缀表达式 in 的使用
    val array: Array<String> = arrayOf("-name", "Xman")
    if ("-name" in array) {
        println(array.indexOf("-name") + 1)
    }
    //使用自己定义的中缀表达式 on，轻易不要自己定义中缀表达式，容易混淆具体含义
    val book: Book = Book()
    val desk: Desk = Desk()
    println("book on desk = ${book on desk}")

}