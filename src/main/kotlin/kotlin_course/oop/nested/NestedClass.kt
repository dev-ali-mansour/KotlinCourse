package kotlin_course.oop.nested

class Department {
    val departmentName = "Engineering"

    class Project {
        fun projectDetails() {
            println("This is a project within the Engineering department.")
        }
    }
}

class University(val name: String) {
    val location = "New York"

    inner class Student(val studentName: String) {
        fun showStudentInfo() {
            println("$studentName is enrolled in $name, located in $location.")
        }
    }
}

class User(val name: String) {

    inner class Task(val taskName: String) {
        fun taskInfo() {
            println("Task: $taskName is assigned to $name.")
        }
    }

    fun addTask(taskName: String): Task {
        return Task(taskName)
    }
}

fun main() {
    // Accessing a nested class
    val project = Department.Project()
    project.projectDetails() // Output: This is a project within the Engineering department.

    // Accessing an inner class
    val university = University("Open University")
    val student = university.Student("John Doe")
    student.showStudentInfo()
    // Output: John Doe is enrolled in Open University, located in New York.


    val user = User("Ali")
    val task1 = user.addTask("Code Review")
    val task2 = user.addTask("Design Meeting")

    task1.taskInfo() // Output: Task: Code Review is assigned to Ali.
    task2.taskInfo() // Output: Task: Design Meeting is assigned to Ali.
}
