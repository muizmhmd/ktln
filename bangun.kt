import kotlin.math.PI
import kotlin.math.sqrt

abstract class Bentuk {
    abstract fun hitungArea() : Double
    abstract fun hitungPrmeter() : Double
}

open class SegiEmpat(val width: Double, val length: Double) : Bentuk() {

    override fun hitungArea(): Double {
        return width*length
    }

    override fun hitungPrmeter(): Double {
        return 2 * (width + length)
    }
}

class Persegi(side: Double) : SegiEmpat(side, side)

class Lingkaran(var radius : Double) : Bentuk() {

    override fun hitungArea(): Double {
        return PI*radius*radius
    }

    override fun hitungPrmeter(): Double {
        return 2*PI*radius
    }
}

fun main() {
    //contoh persegi panjang
    val panjang = 6.0
    val lebar = 3.0
    val persegipanjang = SegiEmpat(panjang, lebar)
    println("Luas persegi panjang = ${persegipanjang.hitungArea()}")

    //contoh persegi
    val sisi = 5.0
    val persegi = Persegi(sisi)
    println("Luas persegi = ${persegi.hitungArea()}")

    //contoh lingkaran
    val r = 5.0
    val lingkaran = Lingkaran(r)
    println("Luas lingkaran = ${lingkaran.hitungArea()}")
}