package kotlin_course.oop

object DatabaseConnection{
    init {
        println("Database connection established")
    }

    fun query(sql:String){
        println("Executing query:$sql")
    }
}

class Book(val title:String,val author:String){
    companion object{
        private var bookCount:Int = 0

        fun getBookCount():Int = bookCount
    }

    init {
        bookCount++
    }

    fun showInfo(){
        println("Book $title by $author")
    }
}

interface ClickListener{
    fun onClick()
}

fun main() {
    DatabaseConnection.query("Select * from users")
    DatabaseConnection.query("Insert into users values('Ali')")
    val book1 = Book(title = "Kotlin programming", author = "Ali Mansour")
    val book2 = Book(title = "C++", author = "Saber Farouk")
    val book3 = Book(title = "Javascript", author = "Ahmed Ouda")

    book1.showInfo()
    book2.showInfo()
    book3.showInfo()

    println("Total created books: ${Book.getBookCount()}")

    val buttonClickListener= object: ClickListener {
        override fun onClick() {
            println("Button clicked")
        }
    }
    buttonClickListener.onClick()
}