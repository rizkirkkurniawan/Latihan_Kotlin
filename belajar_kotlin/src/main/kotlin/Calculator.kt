package main.kotlin

fun main() {
    try {
        print("Masukkan nilai 1: ")
        val angka1 = readLine()!!.toDouble()
        print("Masukkan nilai 2: ")
        val angka2 = readLine()!!.toDouble()
        print("Masukkan nilai 3: ")
        val angka3 = readLine()!!.toDouble()
        print("Masukkan aksi operasi - Tambah(a), Pembagian(b), Perkalian(c), Kurang (d): ")
        when (readLine()) {
            "a" -> {
                print("Hasil = ${angka2+angka3}")
            }
            "b" -> {
                print("Hasil = ${angka2/angka3}")
            }
            "c" -> {
                print("Hasil = ${angka1*angka3}")
            }
            "d" -> {
                print("Hasil = ${angka3-angka1}")
            }
            else -> {
                print("Operasi yang dimasukkan tidak valid")
            }
        }
    } catch (e: Exception){
        print("Angka yang dimasukkan tidak valid")
    }
}