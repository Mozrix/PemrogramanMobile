package model
import androidx.annotation.DrawableRes

data class GameGear(
    val nama: String,
    val deskripsi: String,
    val harga: Int,
    @DrawableRes val imageRes: Int
)