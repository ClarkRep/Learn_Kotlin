package com.clark.learn.kotlin.chapter4

/**
 * @author Clark
 * @description 4.4、类及其成员的可见性
 * @date 2019/3/18
 */

class House

class Flower

class Courtyard() {
    private val house = House()
    //internal 表示模块内可见，在同一个module下的就可以访问到该成员
    internal val flower = Flower()
}

