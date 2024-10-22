package kotlin_course.oop.project.ecommerce.data.order

import kotlin_course.oop.project.ecommerce.model.PaymentMethod

interface Order {

    fun placeOrder()

    fun pay(amount: Double, method: PaymentMethod)
}