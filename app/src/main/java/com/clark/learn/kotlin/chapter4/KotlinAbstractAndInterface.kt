package com.clark.learn.kotlin.chapter4

/**
 * @author Clark
 * @description 4.1、面向对象 - 抽象类与接口（abstract，interface）
 * @date 2019/3/18
 */

interface KotlinInterface {

    //Kotlin的接口可以定义成员变量，相当于定义了一个 setJ() 和 getJ() 这样的接口方法，需要在实现类中需要作为构造参数去实现。
    val j: Int

    fun hello() {
        println(j)
    }
}

class KotlinInterfaceImpl(override val j: Int) : KotlinInterface {

}


fun main() {
    var kotlinInterface: KotlinInterface = KotlinInterfaceImpl(10)
    kotlinInterface.hello()
}

//从程序设计的角度来讲，抽象类反应的是事物的本质，接口反应的是事物的能力。
//直接的说如果你想用抽象类和接口来描述一个东西，那么这个东西的中心词前面的修饰词就是接口要负责的部分，中心词就是抽象类要负责的部分。
//比如：联想笔记本电脑  可以拆解为 <联想><笔记本>电脑  其中 联想、笔记本 是修饰词，电脑是中心词。