package org.example

fun main() {
    val firstName: String = "Ali"
    val lastName = "Mansour"

    println(firstName)

    val size = lastName.length
    println(size)
    println(firstName.length)

    val fullName = firstName + " " + lastName
    println(fullName)

    val fullName2= "$firstName $lastName"
    println(fullName2)

    val fullName3 = firstName.plus(" ").plus(lastName)
    println(fullName3)
}