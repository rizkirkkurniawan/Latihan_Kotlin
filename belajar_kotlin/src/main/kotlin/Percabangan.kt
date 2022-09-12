package main.kotlin

fun main(){
    println("Masukkan Nilai UTS")
    var uts : Int = readLine()!!.toInt()
    println("Masukkan Nilai UAS")
    var uas : Int = readLine()!!.toInt()
    var nilai: Double = (0.4 * uts ) + (0.5 * uas)

    if (nilai >= 80){
        println("ANDA NAIK SEMESTER")
    } else {
        println("AMBIL CUTI MU!")

    }}