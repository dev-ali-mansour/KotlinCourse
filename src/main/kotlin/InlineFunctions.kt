package org.example

fun main() {
    greet("Ali")
    val list = listOf(1,2,3,4,5,6)
    processNumbers(list,{ println(it) })
}

inline fun greet(name:String){
    println("Hello $name")
}

inline fun processNumbers(numbers:List<Int>,action:(Int)->Unit){
    for (number in numbers){
        action(number)
    }
}