package org.example

data class User2(val name: String, val age: Int)

sealed class Shape
data class Circle(val radius: Double) : Shape()
data class Rectangle(val length: Double, val width: Double) : Shape()

fun describeShape(shape: Shape): String {
    return when (shape) {
        is Circle -> "Circle with radius ${shape.radius}"
        is Rectangle -> "Rectangle with length ${shape.length} and width ${shape.width}"
    }
}

fun calculateArea(shape: Shape): Double = when (shape) {
    is Circle -> 2 * 3.14 * shape.radius * shape.radius
    is Rectangle -> shape.length * shape.width
}

fun main() {
     val user1 = User2(name = "Ali", age = 37)
     val user2 = User2(name = "Ali", age = 37)

     println(user1 == user2)
     println(user1)
     println(user1.hashCode())
     println(user2.hashCode())

    val circle = Circle(radius = 5.0)
    val rectangle = Rectangle(length = 10.0, width = 5.0)

    println(describeShape(circle))
    println(describeShape(rectangle))

    println("Area = ${calculateArea(circle)}")
    println("Area = ${calculateArea(rectangle)}")
}