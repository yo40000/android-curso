package com.example.p

open class persona (nombre:String,edad:Int):abs(), game {
    //cualquier clase tiene como super clase "Any", para sobre escribir la clase y la funcion deven
    // ser open, agregar una clase abstracta obliga a la clase a usar la funcion alojada en esta
    open fun work (){
        println("esta persona esta trabajando")
    }

    override fun goToWork() {
        println("esta persona va al tabajo")
    }
    //game interface
    override val game: String = "fornite"

    override fun play() {
        println("esta persona esta jugando $game")
    }
}