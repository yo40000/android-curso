package com.example.p

import kotlin.system.exitProcess

public fun main() {
    fun cal() {
    println("ingresa un numero")
    var num1 = readln().toFloat()
    println("ingrese su segundo numero")
    var num2 = readln().toFloat()


    println("elija su operacion 1 suma 2 resta 3 multiplicacion 4 division ")
    var op = readln().toInt()
    println("su resultado es")

    when (op) {
        1 -> println(num1 + num2)
        2 -> println(num1 - num2)
        3 -> println(num1 * num2)
        4 -> println(num1 / num2)
        else -> println("elija una operacion valida")
    }
    println("desea hacer otra operacion si o no")
    var re = readln()
    when (re) {
        "si" -> cal()
        else -> println("hasta la proxima")
    }
    }
cal()
}