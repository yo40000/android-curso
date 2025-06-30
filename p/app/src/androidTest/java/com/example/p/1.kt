package com.example.p

import javax.microedition.khronos.opengles.GL10

fun main() {

    fun vatiablesYCosntantes() {
        //variables
        var na =
            "yo soy groot" //una ves defindo el tipo de dao de na varible no aceptara otro tipo de dato
        println(na)
        var num =
            3 //el programa marcara como adverertencia si se usa var y esta no es modificada posteriormente
        println(num)
        na = "cambio de bariable"
        println(na)
        num = 55
        println(num)
        var segunda = "segunda variable"
        println(segunda)
        segunda = "mono señor"
        println(segunda)
        //costantes
        val primeraCons = "mota"
        println(primeraCons) //una constante no puede modificar su valor
        val dos = "segunda constante"
        println(dos)
        //tipos de datos
    }

    fun tiposDeDatos() {
        //string
        var dato: String = "esto es un string"
        var dato2 = " esto tambien es un string"
        var sumaDeStrings = dato + dato2
        println(sumaDeStrings)
        //enteros (byte, short, int, long)
        //byte representa numeros entre -127 y 128
        //short respresenta numeros -32767 y 32768 y asi sucesivanente
        var entero = 885
        var entero2 = 4554
        var suma = entero + entero2 //suma de enteros
        println(suma)
        //decimales (float representa hasta 32 bits double respresenta hasta 64 bits)
        var flo: Float =
            1.3f //cuando se esta seguro del largo del numero se puede usar float el numero
        //con una f
        var deci = 3.1416
        var deci2 = 4.5
        var deci4 =
            1 //aunque es un entero kotlin lo convierte internamente en un decimal para poder
        //hacer la suma y entregar un numero double
        var deci3 = deci + deci2 + deci4
        println(deci3)
        //boolean la respuesta puedesir si o no
        val si = true //no me permitio ponerle :boolean
        val no = false
        println(si == no)
        println(si && no)//suma logica si alguno de los balores es falso en tonces el resultado es falso
    }

    //sentencias if
    /* operadores condiconales
    > mayor que <
    menor que
    >= mayor o igual que
    <= menor o igual que
    == igualdad
    !==des igualdad
    operadores logicos
    && operador 'y' se usa para comprobar condiciones  donde todas tinen que ser verdad
    || operador o que almenos una de las condiciones sea verdad
    ! operador no indicara que sea todo lo contrario a lo que la condicion indica
     */
    fun senIF() {
        val num = 19
        if (num <= 10 && num >= 5)   //condicinal if ,al parecer no es necesario usar los brakets
            println("$num es menor  o igual que 10 y mayor que 5  ")
        else if (num >= 1 && num <= 4) println("$num esta entre el 1 y el 4")
        else if (!(num <= 19)) println("el numero igual o mayor que 20 esta fuera de los parmatros")
        else println("$num es mayor que 10") //condicional else
    }

    //SENTENCIA WHEN nos permite revisar de entre una gran lista de condiciones pre establecidas
    fun wn() {
        println("ingresa un pais")
        val pais =
            readln() //en la aplicacion con el emulador no se pueden hacer preguntas por consola
        when (pais) {
            "mexico" -> println("el idioma es español")
            "españa" -> println("el idioma es español")
            "colombia" -> println("el idioma es español")
            "argentina" -> println("el idioma es español")
            "peru" -> println("el idioma es español")
            "EEUU" -> println("el idioma es ingles")
            "inglaterra" -> println("el idioma es ingles")
            "francia" -> println("el idioma es frances")
            "italia" -> println("el idioma es italiano")
            "rusia" -> println("el idioma es ruso")
            "chile" -> println("el idioma es español")
            else -> println("no se encontro el idioma")
        }
        val edad = 19
        when (edad) {
            1, 2, 3 -> println("eres un bebe")
            in 4..10 -> println("eres un niño")
            in 11..18 -> println("eres un niño")
            in 19..59 -> println("eres un adulto")
            in 60..99 -> println("eres un anciano ")
            else -> println("como sigues vivo!")
        }
    }

    // arraus o arreglos
    fun array() {
        val nombre = "ismael"
        val apellido = "valerdi"
        val pais = "mexico"
        val edad = "36"
        //creacion del array
        val my = arrayListOf<String>()
        //agreagr elemntos
        my.add(nombre)
        my.add(apellido)
        my.add(pais)
        my.add(edad) //el array permite elementos repetidos
        println(my)
        my.addAll(listOf("prueba", "yo soy groot")) //añade un conjunto de elemntos
        println(my)
        //acceso a datos
        val myN = my[0]
        println(myN)
        //modificacion de datos
        my[5] = "ya no soy groot"
        println(my)
        //remover
        my.removeAt(5)
        println(my)
        my.forEach { //funcion para recorrer el array
            println(it) //it es el valor que toma cada elemento dentro del array
        }
        //otras operaciones
        //my.clear() borra el contenido del array
        //my.count() cueta los elementos en el array
        // my.sort() ordena el comtenido del array
        //my.first() nos lleva al pŕimer elemento de la lista
        //my.last() muestra el ultimo elemento de la lista
    }

    //maps o diccionarios
    fun mapas() {
        //sintaxis
        var myMap: Map<String, Int> =
            mapOf() //cada vez que se crea un mapOf por defecto borra los datos
        //del anterior mapOf una vez creado no se puede modificar
        //agregar datos
        myMap = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3)
        println(myMap)
        //agreagr elementos a un mapa ya creado
        myMap["cuatro"] = 4
        myMap.put("cinco", 5)
        println(myMap)
        //las claves nopueden ser repetidas, en el momento de repetir una clave esta se actueliza y
        //toma un nuevo valor, los valores pueden ser repetidos en diferentes claves
        //acceso a mapas
        println(myMap["cuatro"])
        //actualizacion
        myMap.put("cinco", 9)
        println(myMap)
        //remover un dato
        myMap.remove("cinco")
        println(myMap)
    }

    //loops y bucles
    fun lops() {
        val myMap = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3)
        val my = arrayListOf("hola", "my", "nombre", "es", "ismael")
        //for
        for (m in my) { //m es el nombre que recibe cada elemento de nuestro array puede ser cualquier
            println(m) //nombre que elijamos
        }
        for (map in myMap) {
            println(map) //en el video se tenia que llamar a cada valor del mapa por separado
            //por medio de un estring aunque solo poniendo el println(map) igual funciona aunque agrega un signo =
            //ambos son validos
            println("${map.key} ${map.value}")
        }

        for (x in 0..10) { //bucle normal
            println(x)
        }
        for (x in 0 until 10) { //no toma en cuenta el ultimo numero
            println(x)
        }
        for (x in 0..10 step 2) { //salta la cuenta el numero que le indiquemos
            println(x)
        }
        for (x in 20 downTo 10 step 2) { //conteo hacia atras con salto
            println(x)
        }
        val numArray = (0..20)//crear un array en rango
        for (num in numArray) {
            println(num)
        }
        //while el bucle persiste mientras la instrucion se cumpla
        var w = 0
        while (w < 10) {
            println(w)
            w += 2 //si se quiere que cada bas que de vuelta el bucle sume mas de uno se escribe
            // asi si no w++ suma uno por vuelta
        }
    }

    //null safety
    fun nullSafety() {
        var nombre = "my name"
        //nombre=null estodaria un error de null
        println(nombre)
        //variable null safety
        var nameSafety: String? =
            "yo soy groot"//añ escribir la variable de esta manera se previene error de nulidad
        //ya que se le da la opcion de que acepte valores nulos
        nameSafety = null
        println(nameSafety)
        nameSafety = "llama a batman"

        /*if(nameSafety != null){ comprovacion mediante if para evitar nulidad al parecer esto
            println(nameSafety!!) ya no funciona en kotlin
        }else {
            print(nameSafety)
        }*/
        //llamada segura
        println(nameSafety?.length) //asi no marca error aunque esye vacia
        nameSafety.let { //obliga a que acepte el valor nulo
            println(it)
        } ?: run() { //este codigo se eecuta cunado se null
            println(nameSafety)
        }
    }
    //funciones
    fun f1(){
        //funcion simple
        fun sat(){
            println("mi nombre es ismael")
        }
        //funcion con parametro de entrada
        fun holo(name:String){ //la variable solicita un string para funcionar
            println("mi nombre es $name")
        }
        fun satAge(name:String, age:Int){ //la variable solicita un string y un entero
            println("mi nombre es $name y mi edad es $age")
        }
    //funciones con retorno
        fun dos(num1:Int,num2:Int):Int{ //la variable solicita dos parametros de tipo entero y regresa un entero
            val suma = num1 + num2
        return suma
        }
        sat()
        sat()
        sat()
        holo("pepe")
        holo("marcos")
        holo("mugre")
        satAge("yo",22)
        satAge("tu",44)
        println(dos(6,6))
        val res = dos(3,6) //crear una variable para almacenar la respuesta y despues imprimir
        println(res)
    }
    //clases cada clase se puede usar un numero infinito de veces mientras se le otorguen los valores
    fun clas(){
     val zero = progra("ismael",36, arrayOf(progra.Lan.PYTHON,progra.Lan.CSS,progra.Lan.KOTLIN),
         null
     )
        println(zero.name)
        zero.dale()

     val per = progra("perro",44, arrayOf(progra.Lan.JAVA,progra.Lan.JAVASCRIT,progra.Lan.HTML),
         arrayOf(zero)
     )
        per.dale()
        println("${per.ami?.first()?.name} es amigo de ${per.name}")
    }
    clas()
    //f1()
    //nullSafety()
    //lops()
    //mapas()
    //array()
    //wn()
    //senIF()
    //tiposDeDatos()
    //vatiablesYCosntantes()
}
