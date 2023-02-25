package uz.itschool.books

class BookAPI {
    companion object {
        fun getBooks(): ArrayList<Book> {
            val books = ArrayList<Book>()
            books.add(Book("Atomic Habits", "James Clear", 2015, "", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic", "James Clear", 2015, "", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Habits", "James Clear", 2015, "", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  12312", "James Clear", 2015, "", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  23", "James Clear", 2015, "", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic Habits 12312 dasd", "James Clear", 2015, "", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  2312dfsf", "James Clear", 2015, "", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  dsad", "James Clear", 2015, "", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic Habitsad wdad", "James Clear", 2015, "", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic Habits sd", "James Clear", 2015, "", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic 321", "James Clear", 2015, "", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            return books
        }
    }
}