package uz.itschool.books

class BookAPI {
    companion object {
        fun getBooks(): ArrayList<Book> {
            val books = ArrayList<Book>()
            books.add(Book("Atomic Habits", "James Clear", 2015, "https://edit.org/photos/images/cat/book-covers-big-2019101610.jpg-1300.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Habits", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  12312", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  23", "James Clear", 2015, "https://imgv3.fotor.com/images/gallery/Childrens-Book-Covers.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic Habits 12312 dasd", "James Clear", 2015, "https://www.adobe.com/express/create/cover/media_178ebed46ae02d6f3284c7886e9b28c5bb9046a02.jpeg?width=400&format=jpeg&optimize=medium", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  2312dfsf", "James Clear", 2015, "https://marketplace.canva.com/EAD7WuSVrt0/1/0/1003w/canva-colorful-illustration-young-adult-book-cover-LVthABb24ik.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  dsad", "James Clear", 2015, "https://images-platform.99static.com//6ELqOlDZNAkWKAlKTT3XjDPSZ_c=/fit-in/590x590/projects-files/83/8342/834261/bc96e38c-765d-4031-a33f-b03eb49bca14.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic Habitsad wdad", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-3-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic Habits sd", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-2-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic 321", "James Clear", 2015, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnp2Ikb9FcID_8z_ENNTQsePDW2wrUE818OcGgAWqEVej0dDzGIdKW4W6YXJmcZKwI2ww&usqp=CAU", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            return books
        }
        fun getMyLibrary(): ArrayList<Book> {
            val books = ArrayList<Book>()
            books.add(Book("Atomic Habits", "James Clear", 2015, "https://edit.org/photos/images/cat/book-covers-big-2019101610.jpg-1300.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Habits", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  12312", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            return books
        }
        fun getMyWishList(): ArrayList<Book> {
            val books = ArrayList<Book>()
            books.add(Book("Atomic  23", "James Clear", 2015, "https://imgv3.fotor.com/images/gallery/Childrens-Book-Covers.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic Habits 12312 dasd", "James Clear", 2015, "https://www.adobe.com/express/create/cover/media_178ebed46ae02d6f3284c7886e9b28c5bb9046a02.jpeg?width=400&format=jpeg&optimize=medium", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  2312dfsf", "James Clear", 2015, "https://marketplace.canva.com/EAD7WuSVrt0/1/0/1003w/canva-colorful-illustration-young-adult-book-cover-LVthABb24ik.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  dsad", "James Clear", 2015, "https://images-platform.99static.com//6ELqOlDZNAkWKAlKTT3XjDPSZ_c=/fit-in/590x590/projects-files/83/8342/834261/bc96e38c-765d-4031-a33f-b03eb49bca14.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic Habitsad wdad", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-3-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic Habits sd", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-2-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            return books
        }
    }
}