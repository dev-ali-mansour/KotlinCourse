package org.example

fun main() {
    val name: String? = "Kotlin"
    if (name != null && name.length > 0) {
        println("String of length ${name.length}")
    } else println("Empty String!")

    val a = "Kotlin"
    val b: String? = null
    println(a?.length)  // Unnecessary safe call
    println(b?.length)

    val l: Int = if (b != null) b.length else -1
    val l2 = b?.length ?: -1

//    val length = b?.length?:throw IllegalArgumentException("Name required")

//    val length = b?.length?: run {
//        println("Error occurred:")
//        throw IllegalArgumentException("Name Required")
//    }

    val len = b!!.length
}