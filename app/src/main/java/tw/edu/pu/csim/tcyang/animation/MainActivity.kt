package tw.edu.pu.csim.tcyang.animation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import tw.edu.pu.csim.tcyang.animation.ui.theme.AnimationTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.foundation.layout.Column

import androidx.compose.material3.Button
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    Animation()
                }
            }
        }
    }
}

@Composable
fun Animation(){
    var appear by remember { mutableStateOf(true) }  //背景出現
    var expanded by remember { mutableStateOf(true) }  //背景延展
    var fly by remember { mutableStateOf(false) }  //火箭升空

    Column {
        Button(
            onClick = { appear = !appear }
        ) {
            if (appear) Text(text = "星空背景圖消失")
            else Text(text = "星空背景圖出現")
        }

        Image(
            painter = painterResource(id = R.drawable.sky),
            contentDescription = "星空背景圖"
        )
    }
}