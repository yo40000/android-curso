package com.example.p

import java.util.Date
import kotlin.concurrent.thread

typealias MyMapList = MutableMap<Int, ArrayList<String>>
typealias MyFun =(Int,String,MyMapList)-> Boolean
typealias mynsted = myNestedAndInner.myInner //alias de una clase anidada para pder llamarla solo
//con el alias
enum class direcction(val dir:Int){
    NORTE(1), SUR(2), ESTE(3), OESTE(4);
    //crear una funcion when para todos los valores, podemos deguir agregando propidades
    // poniendo las entre parentesis como el val dir que es un entero
    fun des():String {
        return when (this){

            NORTE -> "La direccion es norte"
            SUR -> "La direccion es sur"
            ESTE -> "La direccion es este"
            OESTE -> "La direccion es oeste"

        }
    }
}
fun main() {
    //enumClas
    fun enumClases(){
    var userDirections:direcction?= null
        println("usted va hacia $userDirections ")
        userDirections=direcction.ESTE
        println("usted va hacia $userDirections ")
        userDirections=direcction.NORTE
        println("usted va hacia $userDirections ")
        println("propiudad name: ${userDirections.name}")//otra forma de llamar a la propiedad
        println("propiedad ordinal: ${userDirections.ordinal}") //imprime ñaposicion en la lista del
        //ña propidad que se esta usando
        //funciones
        println(userDirections.des())
        println(userDirections.dir)
    }
    //nested and inner clas
    fun nestedAndInner(){
        //nested class
    val nested = myNestedAndInner.myNested() //este llama a la clase y su clas anidada
    val sum = nested.sum(4,6) //este usa el calor que llamas las clases y su funcion
        // interna otorgandole los valores para funcionar
        println("resultado es iguel $sum")
                //inner class
    val iner = myNestedAndInner().myInner() //para llamar un inner primero hay que iniciar la clase
        // superior despues iniciar el inner
    val sumTwo =iner.sumDos(66)
    println("la suma de dos es $sumTwo")
    }
    fun herencia(){
    val programer = programer("zero",55, "kotlin")
        programer.work()
        programer.sayLanguage()
        programer.goToWork()
    val diseñador = diseñador("pedro", 55)
        diseñador.work()
        diseñador.goToWork()
    }

    fun interfaces(){
    val gamer = persona ("zero",33)
        gamer.play()
        gamer.stream()
    }
    //modificadores de visibilidas
    fun modi(){
    val ver=visibility()
        ver.no = "zero"
        ver.setMyname()
    }
    //data classes
    fun dclas(){
        var zero=worker("zero",22,"hippie")
        zero.lastWork="panadero"

        var pepito=worker()

        var rosa=worker("zero",22,"hippie")
        rosa.lastWork="panadero"
        //equals y hashCpde
        if (zero.equals(rosa)){ //tambien se puede usar el signo de igualdad == en lugar del equals
            println("si son iguales")
        }else println("no son igules")
        println(zero.toString())
        //copy
        val zero4 =zero.copy(age=55)
        println(zero.toString())
        println(zero4.toString())
        //coponetN
        val (name,age)= rosa
        println(name)
        println(age)

    }
    //type aliases
    var mymap: MutableMap<Int, ArrayList<String>> = mutableMapOf()
        //todo el tio se defiene en el alias y se puede cambiar unicamente la etiqueta que
    //se le dio tambien se puede hace con funciones
    fun talises(){
        var myNewMap: MyMapList = mutableMapOf()
        myNewMap[1]= arrayListOf("yo","lo")
        myNewMap[2]= arrayListOf("pato","diez")
        mymap=myNewMap
    }

    fun elWorker():worker{
        return worker("zero",44,"vendedor")
    }
    //declaracion desestructuracion
    fun dd(){
        //si no de resquiere llamsr a una de los valores de worker se pone subrrayado
        // (name, _ , work) se pone asi 
    val (name,age,work)= worker("zero",44,"vendedor")
    println("el numbre es $name su edad es $age y trabaja como $work")
        val pepe=worker("pepe",22,"pepenador")
        println(pepe.component1())

        val (zeroName,zeroAge,zeroWork)= elWorker()
        println("$zeroName $zeroAge $zeroWork")

        val map1 = mapOf(1 to "rata", 2 to "perro", 3 to "gato")
        //for (el in map1) asi se aria de forma normal
        for ((id,na) in map1){
            //println("${el.component1()},${el.component2()} ")
            println("${id},${na} ")
        }

    }
    //extenciones
    fun ex(){
    val myDate= Date()
        println(myDate.customeFormat())
        println(myDate.formaSize)

        var myDateNuleable: Date? = null
        println(myDateNuleable.customeFormat())
        println(myDateNuleable.formaSize)
    }
    //lambdas
    //pide un valor x , y crea una funcion que pide dos valores enteros y devuelve otro entero
    //duvuelve la funcioncon los valores x,y
    fun myOperateFun(x:Int , y:Int,myFun: (Int,Int)->Int):Int{
        return myFun(x,y)
    }
    //valor name que es un string valor hello que es otro strin que devuelve un unit vacio
    //valor con que añade hello al nombre, depues un hilo que agrega un retraso y devuelve como hello
    //el string que pide el nombre
    fun myAsinc(name:String , hello:(String) -> Unit){
        val myNewS = "hello$name!"
        thread {
            Thread.sleep(5000)
            hello(myNewS)
        }

    }
    fun lam(){ //una lista que contiene un array de numeros, valor que usa la lista y le agrega un filtro
        val myIntList = arrayListOf(0,1,2,3,4,5,6,7,8,9,10)
        val myfilterlist=myIntList.filter{
            myInt -> //se nombra a los valores de la lista
            println(myInt) //imprime los objetos de la lista
            if(myInt==1){  //si el valor de la lista es igual a 1 se agrega a el filtro
                return@filter true

            }
                myInt >5 //se imprime si es mayor que 5


        }
        println(myfilterlist) //imprimir lista filtrada
        val sumFun = fun(x:Int,y:Int):Int = x+y //valor con funcion pide dos valores y lso suma
        val mulFun = fun(x:Int,y:Int):Int = x*y //valor con funcion mliplica los valore
        myAsinc("zero") { //valores para ejecutar el lambda le da el nombre y luego se imprime
            println(it)
        }
        println(myOperateFun(7,8,sumFun)) //da los valorers y proporciona la funcion
        println(myOperateFun(36,77,mulFun)) // dalos valores y proporciona la funcion
        println(myOperateFun(8,5){ x, y -> x - y})  //da los calores pero al noexistir la funcion
        //se crea directamente en el llamado
    }

    lam()
    //ex()
    //dd()
    //talises()
    //dclas()
    //modi()
   // interfaces()
    //herencia()
   // nestedAndInner()
    //enumClases()
}