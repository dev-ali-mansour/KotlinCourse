package kotlin_course.oop.principles

class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $amount, Current balance = $balance ")
        } else println("Amount must be positive!")
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdraw $amount, Current balance = $balance")
        } else println("Withdrawal amount is invalid!")
    }

    fun getBalance(): Double {
        return balance
    }
}

class Person {
    public var name: String = ""
    private var age: Int = 0
    internal var address: String = "Unknown address"

    fun showInfo() {
        println("Name: $name, Age: $age, Address: $address")
    }

    private fun incrementAge() {
        age += 1
    }

    fun birthday() {
        incrementAge()
        println("Happy birthday, New age is $age")
    }
}

class User {
    var name: String = "Anonymous"
        get() = field
        set(value) {
            if (value.isNotEmpty()) {
                field = value
            } else println("Name can not be empty!")
        }
}

fun main() {
    val account = BankAccount()
    account.deposit(500.0)
    account.withdraw(200.0)
    println("Final balance = ${account.getBalance()}")

    // account.balance = 1000 // Uncommenting this line will cause compile time error

    val person = Person()
    println(person.name)
    //println(person.age) // Uncommenting this line will cause compile time error
    println(person.address)
    person.showInfo()
    person.birthday()

    val user = User()
    println(user.name)
    user.name = "Ali"
    println(user.name)
    user.name = ""
}