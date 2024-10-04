package kotlin_course.oop.best_practices

// 1) Composition OVer Inheritance
class Keyboard(val type: String) {
    fun pressKey(key: String) {
        println("Key $key is pressed")
    }
}

class Computer(val brand: String, private val keyboard: Keyboard) {
    fun typeText(text: String) {
        println("Start typing on ${keyboard.type} keyboard")
        text.forEach { keyboard.pressKey(it.toString()) }
    }
}

// 2) Using Data class for static data
data class User(val name: String, val age: Int)

// 3) Single Responsibility Principle
class Order(private val items: List<String>, private val totalAmount: Double) {

    fun printOrder() {
        println("Order Details: $items, Total: $totalAmount")
    }

    fun calculateTotal() {
        println("Total amount: $totalAmount")
    }

    fun saveToDatabase() {
        println("Order saved to database")
    }
}

class Order2(val items: List<String>, val totalAmount: Double)

class OrderPrinter {
    fun printOrder(order: Order2) {
        println("Order Details: ${order.items}, Total: ${order.totalAmount}")
    }
}

class OrderCalculator {
    fun calculateTotal(order: Order2): Double {
        return order.totalAmount
    }
}

class OrderRepository {
    fun save(order: Order2) {
        println("Order saved to database")
    }
}

// 4) Use Encapsulation for class behaviors and data
class BankAccount(private var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
        }
    }

    fun showBalance() {
        println("Current balance: $balance")
    }
}

// 5) Use Delegation instead of direct inheritance
interface Printer {
    fun printDocument()
}

class DefaultPrinter : Printer {
    override fun printDocument() {
        println("Printing document...")
    }
}

class SmartPrinter(printer: Printer) : Printer by printer

//6) Use Sealed classes for specific known statuses
sealed class Response

class Success(val data: String) : Response()
class Error(val errorMessage: String) : Response()

fun handleResponse(response: Response) {
    when (response) {
        is Success -> println("Data: ${response.data}")
        is Error -> println("Error: ${response.errorMessage}")
    }
}

fun main() {
    val keyboard = Keyboard(type = "Mechanic")
    val computer = Computer(brand = "DELL", keyboard = keyboard)
    println("Computer Brand: ${computer.brand}")
    computer.typeText("Hello kotlin")

    val user1 = User(name = "Ali", age = 38)
    val user2 = User(name = "Ali", age = 38)
    val user3 = user1.copy(name = "Ahmed")
    println(user1 == user2)
    println(user3)

    val order = Order2(listOf("CPU", "Mother Board", "RAM"), totalAmount = 5000.0)
    val orderPrinter = OrderPrinter()
    orderPrinter.printOrder(order)
    val orderCalculator = OrderCalculator()
    orderCalculator.calculateTotal(order)
    val orderRepository = OrderRepository()
    orderRepository.save(order)

    val bankAccount = BankAccount(balance = 1000.0)
    bankAccount.deposit(5000.0)
    bankAccount.withdraw(2000.0)
    bankAccount.showBalance()

    val printer = DefaultPrinter()
    val smartPrinter = SmartPrinter(printer = printer)
    smartPrinter.printDocument()

    val response1 = Success(data = "Received data!")
    val response2 = Error(errorMessage = "Failed to connect to the server!")
    handleResponse(response1)
    handleResponse(response2)

}



