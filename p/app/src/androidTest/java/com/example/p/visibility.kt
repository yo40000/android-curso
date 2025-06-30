package com.example.p

class visibility {
    var no:String?= null
    fun setMyname(){
        no?.let {
            println("mi nombre es $it")//se ejecuta cuando el valor no es nulo funciona como if
        }?:run{
            println("no tengo nombre")//se ejecuta cuado el valor es nulo funciona como un else
        }
    }
}
//por defecto una clase es publica, se puede instanciar una clase privada desde el mismo fichero
//fera del el la clase es invisible, protectec funciona como privado excto para una sub clase conde
//funcionara como puclico, internal funciona dentro de ficheroes que se ejcutan juntos  