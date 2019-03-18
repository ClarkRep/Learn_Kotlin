package com.clark.learn.kotlin.chapter4

/**
 * @author Clark
 * @description 4.5、object
 * @date 2019/3/18
 */

abstract class Player

object MusicPlayer : Player()

fun main() {
    val musicPlayer = MusicPlayer
}