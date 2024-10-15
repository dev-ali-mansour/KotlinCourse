package org.example.kotlin_course.oop.project.ecommerce

interface Cart {

    val items: List<Product>

    fun addProduct(productId: Int)

    fun getTotalPrice(): Double
}