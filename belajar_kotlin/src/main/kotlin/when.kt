package main.kotlin

fun main(args: Array<String>){
    var x: Int = 13


    when (x) {
        3,4,5 -> print("It Is summer season")
        6,7,9 -> print("It Is rainy season")
        8,11 -> print("It Is autumn season")
        10,12,1,2 -> print("It Is winter season")
        else -> {
            print("salah input tuu!")
        }
    }
}