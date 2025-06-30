package com.example.p

class myNestedAndInner {
    val one = 1
    fun returnOnr():Int{ //esta funcion es redundante hace lo mismo que el de arriba pero es par el ejemplo
        return one

    }
    class myNested{
    fun sum (num1:Int,num2:Int):Int{
        return num1+num2
    }
    }
    //inner es clase interna que se puede usar con valores y funciones en el mismo nivel
    inner class myInner{
        fun sumDos(number:Int):Int{
        return number + one +returnOnr()
        }
    }
}

