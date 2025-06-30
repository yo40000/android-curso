package com.example.a1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a1.ui.theme._1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        variablesYCostantes()
        tiposDeDatos()
        senIf()
        wn()
        setContent {
            _1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "game master ",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

    }

}
 fun variablesYCostantes() {
     //variables
     var na = "yo soy groot" //una ves defindo el tipo de dao de na varible no aceptara otro tipo de dato
     println(na)
     var num = 3 //el programa marcara como adverertencia si se usa var y esta no es modificada posteriormente
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
}
fun tiposDeDatos(){
    //string
    var dato:String ="esto es un string"
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
    var flo:Float = 1.3f //cuando se esta seguro del largo del numero se puede usar float el numero
    //con una f
    var deci = 3.1416
    var deci2 = 4.5
    var deci4 = 1 //aunque es un entero kotlin lo convierte internamente en un decimal para poder
    //hacer la suma y entregar un numero double
    var deci3 = deci + deci2 + deci4
    println(deci3)
    //boolean la respuesta puedesir si o no
    val si = true //no me permitio ponerle :boolean
    val no = false
    println(si == no)
    println(si && no)//suma logica si alguno de los balores es falso en tonces el resultado es falso
}
fun senIf(){
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
        val num = 19
        if (num <= 10 && num >= 5)   //condicinal if ,al parecer no es necesario usar los brakets
            println("$num es menor  o igual que 10 y mayor que 5  ")
        else if (num >= 1 && num <=4 ) println("$num esta entre el 1 y el 4")
        else if (!(num <=19) ) println("el numero igual o mayor que 20 esta fuera de los parmatros")
        else println("$num es mayor que 10") //condicional else
}

fun wn(){
    println("ingresa un pais")
    val pais = "colombia"
    when(pais){
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
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _1Theme {
        Greeting("Android")
    }
}