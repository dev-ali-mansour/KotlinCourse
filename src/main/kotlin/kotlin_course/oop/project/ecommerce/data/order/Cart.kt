package org.example.kotlin_course.oop.project.ecommerce.data.order

import org.example.kotlin_course.oop.project.ecommerce.model.Product

interface Cart {

    val items: List<Product>

    fun addProduct(productId: Int)

    fun getTotalPrice(): Double
}