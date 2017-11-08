package com.wchy

import java.awt.event.ItemEvent

/**
 * Created by wangchangye on 2017/4/13.
 */

fun main(args: Array<String>) {
    println("hello kotlin!")
    val a = 1;
    val b = 2;
    println( if (a>b) a else b)
    when (a){
        1 -> println("a == 1")
        2 -> println("a == 2")
        else -> {
            println("a is not 1 or 2")
        }
    }
    if (b in 1..10){
        println("b is $b")
    }
    val x = "prefixxxxxxx"
    val hasPrefix = when (x){
        is String -> x.startsWith("prefix")
        else -> false
    }
    val y = "abcde"
    for (item in y) println(item)

    fun maxOf(a:Int, b:Int) = if (a > b) a else b;
    println(maxOf(1,2))
    //Loops
    var a1:Array<String> = arrayOf("hello","world")
    for (item in a1){
        println(item)
    }



}//end of kotlin