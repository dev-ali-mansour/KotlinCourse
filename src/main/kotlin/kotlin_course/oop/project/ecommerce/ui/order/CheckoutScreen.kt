package kotlin_course.oop.project.ecommerce.ui.order

import kotlin_course.oop.project.ecommerce.model.CreditCard
import kotlin_course.oop.project.ecommerce.data.order.Order

fun checkout(order: Order) {
    println("#############")
    println("Checkout Screen")
    println("#############")
    println("Please choose your payment method:")
    println("1) Cash on delivery")
    println("2) Credit Card")
    var repeat = true
    while (repeat) {
        val choice = readln().toInt()
        when (choice) {
            1 -> {
                repeat = false
                println("You will pay using cash on delivery")
            }

            2 -> {
                repeat = false
                payWithCard(order = order)
            }

            3 -> println("Invalid choice! try again")
        }
    }
}


fun payWithCard(order: Order) {
    var repeat = true
    while (repeat) {
        runCatching {
            print("Amount: ")
            val amount = readln().toDouble()
            print("Card number: ")
            val number = readln()
            print("Month: ")
            val month = readln().toShort()
            print("Year: ")
            val year = readln().toShort()
            print("CVC: ")
            val cvc = readln().toShort()

            val card = CreditCard(number = number, month = month, year = year, cvc = cvc)
            order.pay(amount = amount, method = card)
            repeat = false
        }.onFailure { println("Payment Error: ${it.message}") }
    }
}