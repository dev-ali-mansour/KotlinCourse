package kotlin_course.exception_handling

import java.io.IOException

fun main() {
     try{
         val result = riskyOperation()
     }catch (e:Exception){
         println("An error occurred ${e.message}")
     }

    try {
        val data = fetchDataFromServer()
    } catch (e: IOException) {
        println("An error occurred: ${e.message}")
    } finally {
        closeConnection()
    }
}

fun closeConnection() {
    println("Close connection")
}

fun fetchDataFromServer(): String {
    throw IOException("Server unreachable")
    return "Server response"
}

fun riskyOperation() {
    println("Risky operation")
    throw Exception("Invalid User data!")
}