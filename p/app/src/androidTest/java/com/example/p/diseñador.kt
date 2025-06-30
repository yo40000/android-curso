package com.example.p

class diseñador(nombre:String,edad:Int):persona(nombre,edad) {

    override fun work() { //sobre escribe la funcion work de su clase pade persona
        println("esta persona esta diseñando")
    }

    override fun goToWork() {
        println("est persona va a trabajar a google")
    }
}