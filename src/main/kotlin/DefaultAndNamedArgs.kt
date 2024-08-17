package org.example

fun main() {
    greet("Sara")
    greet(greeting = "Hi", name = "Ali")
    createProduct("New Shoes", 49.99)
}

fun greet(name: String, greeting: String = "Hello") {
    println("$greeting $name")
}

fun createProduct(name: String, price: Double, discount: Double = 0.0, category: Int = 1) {
    println("Product name: $name, price: $price$, with discount: $discount% from category $category")
}