package kotlin_course.oop.project.ecommerce.ui.order

import kotlin_course.oop.project.ecommerce.data.order.CartImpl
import kotlin_course.oop.project.ecommerce.data.order.OrderImpl
import kotlin_course.oop.project.ecommerce.data.order.products
import kotlin_course.oop.project.ecommerce.showMainScreen

fun showProducts() {

    println("###################")
    println("Products Screen")
    println("###################")

    println("Choose a product to add to cart")

    products.forEach { product ->
        println("${product.id}) ${product.name} ==> ${product.price} EGP")
    }
    val cart = CartImpl()
    var repeat: Boolean
    do {
        print("Product ID: ")
        val id = readln().toInt()
        cart.addProduct(productId = id)
        print("Do you want to add another one? Y = Yes: ")
        val choice = readln().first()
        repeat = choice.lowercaseChar() == 'y'
    } while (repeat)

    val order = OrderImpl(cart = cart)
    order.placeOrder()

    checkout(order = order)

    println("Back to the Main Screen")
    showMainScreen()
}