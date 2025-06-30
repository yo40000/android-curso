package com.example.p

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun Date?.customeFormat() :String? {
val formater = SimpleDateFormat("yyyy-MM-dd 'T' HH-mm-ssZZZ", Locale.getDefault())
  if (this != null) {
      return formater.format(this)
  }
    return null
}
val Date?.formaSize : Int
    get() = this.customeFormat()?.length ?:0
/* la funciondate al ser un elemento complejo reuqiere que se le asigne un formato
* cualquier cosa a la que se le quiera asignar un valor nulo debe ser indicado con un ? para
* iniciar un valor debe usarse get()*/