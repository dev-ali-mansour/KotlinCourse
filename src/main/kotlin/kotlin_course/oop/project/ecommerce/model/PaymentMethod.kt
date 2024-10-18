package org.example.kotlin_course.oop.project.ecommerce.model

sealed class PaymentMethod

class CashOnDelivery : PaymentMethod()

class CreditCard(number: String, month: Short, year: Short, cvc: Short) : PaymentMethod()