package org.example.kotlin_course.oop.project.ecommerce.data.order

import org.example.kotlin_course.oop.project.ecommerce.model.PaymentMethod

class OrderImpl(private val cart: Cart): Order {

    override fun placeOrder() {
        val total = cart.getTotalPrice()
        println("Order placed")
        cart.items.forEach { println(it) }
        println("Total amount: $total")
    }

    override fun pay(amount: Double, method: PaymentMethod) {
        if (amount != cart.getTotalPrice())
            throw Throwable(message = "Invalid amount!")
        println("Order has been paid successfully!")
    }
}
