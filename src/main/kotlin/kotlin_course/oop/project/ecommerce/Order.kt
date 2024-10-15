package org.example.kotlin_course.oop.project.ecommerce

interface Order {

    fun placeOrder()

    fun pay(amount: Double, method: PaymentMethod)
}