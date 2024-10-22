package kotlin_course.exception_handling

import java.io.FileNotFoundException
import java.io.IOException
import java.text.ParseException

fun main() {
    try {
        readFile("data.json")
    } catch (e: IOException) {
        // Handle IOException
    } catch (e: FileNotFoundException) {
        // Handle FileNotFoundException
    } catch (e: ParseException) {
        // Handle ParseException
    } catch (e: Exception) {
        // Handle any other exception
    }

    try {
        readFile("data.json")
    } catch (e: Exception) {
        when (e) {
            is FileNotFoundException->{/* Handle FileNotFoundException */}
            is IOException -> {/* Handle IOException */}
            is ParseException-> { /* Handle ParseException */ }
            else -> {/* Handle any other exception */}
        }
    }

    runCatching { readFile("data.json") }
        .onFailure { e->
            when (e) {
                is FileNotFoundException->{/* Handle FileNotFoundException */}
                is IOException -> {/* Handle IOException */}
                is ParseException-> { /* Handle ParseException */ }
                else -> {/* Handle any other exception */}
            }
        }
}

fun readFile(path: String) {}