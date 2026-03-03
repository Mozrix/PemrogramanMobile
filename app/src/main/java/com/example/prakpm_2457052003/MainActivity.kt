package com.example.prakpm_2457052003

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
import model.GameGear
import model.Source
import com.example.prakpm_2457052003.ui.theme.PrakPM_2457052003Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakPM_2457052003Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    val GameGear = Source.dummyGameGear[2]
    val GameGear2 = Source.dummyGameGear[1]
    val GameGear3 = Source.dummyGameGear[0]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {

        Row() {
            Image(
                painter = painterResource(id = R.drawable.keyboard),
                contentDescription = "Gambar ${GameGear.nama}",
                modifier = Modifier.size(200.dp)
            )
            Column(modifier = Modifier.padding(top = 40.dp)) {
                Text(text = "Nama: ${GameGear.nama}")
                Text(text = "Deskripsi: ${GameGear.deskripsi}")
                Text(text = "Harga: Rp ${GameGear.harga}")
            }
        }

        Row() {
            Image(
                painter = painterResource(id = R.drawable.headset),
                contentDescription = "Gambar ${GameGear2.nama}",
                modifier = Modifier.size(200.dp)
            )
            Column(modifier = Modifier.padding(top = 40.dp)) {
                Text(text = "Nama: ${GameGear2.nama}")
                Text(text = "Deskripsi: ${GameGear2.deskripsi}")
                Text(text = "Harga: Rp ${GameGear2.harga}")
            }
        }

        Row() {
            Image(
                painter = painterResource(id = R.drawable.mouse),
                contentDescription = "Gambar ${GameGear3.nama}",
                modifier = Modifier.size(200.dp)
            )
            Column(modifier = Modifier.padding(top = 40.dp)) {
                Text(text = "Nama: ${GameGear3.nama}")
                Text(text = "Deskripsi: ${GameGear3.deskripsi}")
                Text(text = "Harga: Rp ${GameGear3.harga}")
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrakPM_2457052003Theme {
    }
}