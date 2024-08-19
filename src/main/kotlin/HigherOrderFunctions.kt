package org.example

fun main() {

    val result = applyOperation(5, 6, { num1, num2 -> num1 * num2 })
    println(result)

    val numbers = listOf(1, 2, 3, 4, 5)
    val doubled = mutableListOf<Int>()
    for (n in numbers) {
        if (n % 2 == 0)
            doubled.add(n * 2)
    }
    println(doubled)

    val doubledNumbers = numbers.filter { it % 2 == 0 }.map{it*2}
    println(doubledNumbers)
}

fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}