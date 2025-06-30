package com.example.p
//unja clase no se puede extender de dos clases para eso la segunda clase debe convertirse en interface
class programer(nombre:String,edad:Int,val lenguge:String):persona(nombre, edad),veiculo  {
    override fun work() {
      println("esta persona esta programando")
    }
    fun sayLanguage(){
        println("esta programando en $lenguge")
    }

    override fun drive() {
        println("esta persona va en bici")
    }
}