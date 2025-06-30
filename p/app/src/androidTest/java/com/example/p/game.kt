package com.example.p
//una interface no puede contener un constructor, no contiene estados solo comportamientos 
interface game {
    val game:String
    fun play ()
    fun stream(){
    println("estoy haciendo stream de $game")
    }
}