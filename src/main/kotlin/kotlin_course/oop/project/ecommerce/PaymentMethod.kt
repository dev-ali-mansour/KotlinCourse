package org.example.kotlin_course.oop.project.ecommerce

sealed class PaymentMethod

class CashOnDelivery : PaymentMethod()

class CreditCard(number: String, month: Short, year: Short, cvc: Short) : PaymentMethod()