package org.example.kotlin_course.oop.project.ecommerce.data.order

import org.example.kotlin_course.oop.project.ecommerce.model.PaymentMethod

interface Order {

    fun placeOrder()

    fun pay(amount: Double, method: PaymentMethod)
}