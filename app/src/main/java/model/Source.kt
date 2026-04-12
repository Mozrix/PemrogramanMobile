package model
import com.example.prakpm_2457052003.R

object Source{
    val dummyGameGear = listOf(
        GameGear("Mouse", "Rekomendasi Mouse Buget", 500000, R.drawable.mouse),
        GameGear("Headset", "Rekomendasi Headset Buget", 1000000, R.drawable.headset),
        GameGear("Keyboard", "Rekomendasi Keyboard Buget", 800000, R.drawable.keyboard)
    )

    val reccomendGear = listOf(
        GameGear(nama = "Pulsar X2", deskripsi = "Approve by Most VCT Masters Winners", harga = 1599000, imageRes = R.drawable.mpulsar),
        GameGear(nama = "Wooting 60HE", deskripsi = "Approve by Most VCT Master Winner", harga = 1499000, imageRes = R.drawable.kwoot),
        GameGear(nama = "Hyper X Cloud 3", deskripsi = "Approve by Forsaken", harga = 1200000, imageRes = R.drawable.hhyper )
    )
}