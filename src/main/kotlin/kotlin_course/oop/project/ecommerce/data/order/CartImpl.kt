package org.example.kotlin_course.oop.project.ecommerce.data.order

import org.example.kotlin_course.oop.project.ecommerce.model.Product

val products = listOf(
    Product(id = 1, name = "Laptop", price = 15000.0),
    Product(id = 2, name = "Mouse", price = 90.0),
    Product(id = 3, name = "Mouse Pad", price = 30.0),
    Product(id = 4, name = "Speakers", price = 650.0),
    Product(id = 5, name = "Laptop Bag", price = 450.0)
)

class CartImpl : Cart {

    private val _items = mutableListOf<Product>()

    override val items: List<Product> = _items

    override fun addProduct(productId: Int) {
        val product = products.firstOrNull { it.id == productId }
        product?.let {
            _items.add(it)
            println("${it.name} added to cart.")
        } ?: println("Invalid product Id!")
    }

    override fun getTotalPrice(): Double = _items.sumOf { it.price }
}
