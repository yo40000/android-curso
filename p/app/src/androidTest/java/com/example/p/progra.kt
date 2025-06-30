package com.example.p
//a una clase se le puede asignar esa misma clase como en la variable 4 que tambien puede ser nula
public class progra(val name:String,
                    val age:Int,
                    val lan:Array<Lan>,
                    val ami:Array<progra>?){
//para poder acceder a una clase desde otra locacion hay que definir los valores de la clase con lo que
    // son en este caso un val
    enum class Lan{
    KOTLIN,
    JAVA,
    JAVASCRIT,
    PYTHON,
    HTML,
    CSS
    }
    //enumera los valores que puede tener una clase para que no se lu puedan pasar otros
fun dale() {
    for (l in lan) { //funcion para recorrer el array e imprimirlo l define a cada valor en len
        println("$name im programing in $l")

    }
}
}