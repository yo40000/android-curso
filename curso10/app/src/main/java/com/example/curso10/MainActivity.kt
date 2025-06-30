package com.example.curso10

import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.curso10.ui.theme.Curso10Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyImage()
            MyTexts()
        }
    }
}

@Composable
fun MyImage(){


}

@Composable
fun MyTexts () {
    Column {
        MyText("Hola hippies")
        MyText("Como se encuentran hoy ") }

}
@Composable
fun MyText (text: String){
    Text(text)
}
@Preview
@Composable
fun PreviewTexts(){
    MyImage()
    MyTexts()
}

