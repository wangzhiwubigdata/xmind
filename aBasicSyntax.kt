package com.wchy

/**
 * Created by wangchangye on 2017/4/13.
 */

fun main(args: Array<String>) {

    //Basic types

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    val a:Int = 1000;
    print(a == a)
    val boxedA1:Int? = a
    val anotherBoxedA1:Int? = a
    print(boxedA1 == anotherBoxedA1)

    val b: Int = 10000
    print(b === b) // Prints 'true'
    val boxedA: Int? = b
    val anotherBoxedA: Int? = b
    print(boxedA === anotherBoxedA) // !!!Prints 'false'!!!


    fun decimalDigitValue(c: Char): Int{
        if(c !in '0'..'9')
            throw IllegalArgumentException("out of range")
        return  c.toInt() - '0'.toInt()
    }
    println(decimalDigitValue('9'))

    //array
    val asc = arrayOf(1,2,3)
    asc[0] = asc[1] + asc[2]

    val s = "hello world!\n"
    for (c in s) print(c)

    val i = 10;
    val s1 = "i = $i"
    println(s1)

    val s2 = "abc"
    val str = "$s.length is ${s.length}"

}//end