package com.clark.learn.kotlin.chapter4

/**
 * @author Clark
 * @description 4.2、子承父类 - 继承1
 * @date 2019/3/18
 */


abstract class Manager

interface Writer {
    fun write()
}

interface Driver {
    fun drive()
}

/**
 * 方式一：这种方式是常规的写法，具体的 write()、drive() 方法都交给构造参数的变量来实现了，可以简写为方式二。
 */
/*class SeniorManager(val writer: Writer, val driver: Driver) : Manager(), Driver, Writer {

    override fun write() {
        writer.write()
    }

    override fun drive() {
        driver.drive()
    }
}*/

/**
 * 方式二：接口代理，这种方式，直接将 SeniroManager 实现 Writer、Driver 接口的方法，代理给了构造参数的 writer、driver。
 */
class SeniorManager(val writer: Writer, val driver: Driver) : Manager(), Writer by writer, Driver by driver

class CarDriver : Driver {
    override fun drive() {
        println("开车呢")
    }
}

class PPTWriter : Writer {
    override fun write() {
        println("写ppt呢")
    }
}

fun main() {
    val driver = CarDriver()
    val writer = PPTWriter()

    val manager = SeniorManager(writer, driver)
    manager.write()
    manager.drive()
}

