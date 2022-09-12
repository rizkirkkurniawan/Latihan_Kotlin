package main.kotlin

fun main() {
    println("versi for hitungan mundur")
    print("=== ")

    for (i in 20 downTo 0) {
        print("$i ")
    }
    println(" ")
    println("versi for step 3")
    print("=== ")
    for (i in 3 .. 30 step 3){
        print("$i ")
    }
}