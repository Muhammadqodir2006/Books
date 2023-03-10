package uz.itschool.books

abstract class BookAPI {
    companion object {
        val books = initBooks()
        val wishLIst = ArrayList<Book>()
        val myLibrary = ArrayList<Book>()

        fun getBooks(genre: Genre): ArrayList<Book> {
            val books = ArrayList<Book>()
            books.add(Book("Atomic 1", "James Clear", 2015, "https://edit.org/photos/images/cat/book-covers-big-2019101610.jpg-1300.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic 2", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Habits 3", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  4", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  5", "James Clear", 2015, "https://imgv3.fotor.com/images/gallery/Childrens-Book-Covers.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.ARTS ))
            books.add(Book("Atomic 6", "James Clear", 2015, "https://www.adobe.com/express/create/cover/media_178ebed46ae02d6f3284c7886e9b28c5bb9046a02.jpeg?width=400&format=jpeg&optimize=medium", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.ARTS ))
            books.add(Book("Atomic  7", "James Clear", 2015, "https://marketplace.canva.com/EAD7WuSVrt0/1/0/1003w/canva-colorful-illustration-young-adult-book-cover-LVthABb24ik.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.CRIME ))
            books.add(Book("Atomic  8", "James Clear", 2015, "https://images-platform.99static.com//6ELqOlDZNAkWKAlKTT3XjDPSZ_c=/fit-in/590x590/projects-files/83/8342/834261/bc96e38c-765d-4031-a33f-b03eb49bca14.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.CRIME ))
            books.add(Book("Atomic 9", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-3-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.CRIME ))
            books.add(Book("Atomic 10", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-2-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.CRIME ))
            books.add(Book("Atomic 11", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.BIOGRAPHY ))
            books.add(Book("Habits 12", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.BIOGRAPHY ))
            books.add(Book("Atomic  13", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  14", "James Clear", 2015, "https://imgv3.fotor.com/images/gallery/Childrens-Book-Covers.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic 15", "James Clear", 2015, "https://www.adobe.com/express/create/cover/media_178ebed46ae02d6f3284c7886e9b28c5bb9046a02.jpeg?width=400&format=jpeg&optimize=medium", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  16", "James Clear", 2015, "https://marketplace.canva.com/EAD7WuSVrt0/1/0/1003w/canva-colorful-illustration-young-adult-book-cover-LVthABb24ik.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.DRAMA ))
            books.add(Book("Atomic  17", "James Clear", 2015, "https://images-platform.99static.com//6ELqOlDZNAkWKAlKTT3XjDPSZ_c=/fit-in/590x590/projects-files/83/8342/834261/bc96e38c-765d-4031-a33f-b03eb49bca14.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.DRAMA ))
            books.add(Book("Atomic 18", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-3-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.DRAMA ))
            books.add(Book("Atomic 19", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-2-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.DRAMA ))
            books.add(Book("Atomic 20", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.FICTION ))
            books.add(Book("Habits 21", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.FICTION ))
            books.add(Book("Atomic  22", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.FICTION ))
            books.add(Book("Atomic  23", "James Clear", 2015, "https://imgv3.fotor.com/images/gallery/Childrens-Book-Covers.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.FICTION ))
            books.add(Book("Atomic 24", "James Clear", 2015, "https://www.adobe.com/express/create/cover/media_178ebed46ae02d6f3284c7886e9b28c5bb9046a02.jpeg?width=400&format=jpeg&optimize=medium", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.FICTION ))
            books.add(Book("Atomic  25", "James Clear", 2015, "https://marketplace.canva.com/EAD7WuSVrt0/1/0/1003w/canva-colorful-illustration-young-adult-book-cover-LVthABb24ik.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.MYSTERY ))
            books.add(Book("Atomic  26", "James Clear", 2015, "https://images-platform.99static.com//6ELqOlDZNAkWKAlKTT3XjDPSZ_c=/fit-in/590x590/projects-files/83/8342/834261/bc96e38c-765d-4031-a33f-b03eb49bca14.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.MYSTERY ))
            books.add(Book("Atomic 27", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-3-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.MYSTERY ))
            books.add(Book("Atomic 28", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-2-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.MYSTERY ))
            books.add(Book("Atomic 29", "James Clear", 2015, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnp2Ikb9FcID_8z_ENNTQsePDW2wrUE818OcGgAWqEVej0dDzGIdKW4W6YXJmcZKwI2ww&usqp=CAU", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.POETRY ))
            books.add(Book("Atomic 30", "James Clear", 2015, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnp2Ikb9FcID_8z_ENNTQsePDW2wrUE818OcGgAWqEVej0dDzGIdKW4W6YXJmcZKwI2ww&usqp=CAU", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.POETRY ))
            books.add(Book("Atomic 31", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.POETRY ))
            books.add(Book("Habits 32", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.POETRY ))
            books.add(Book("Atomic  33", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.RELIGIOUS ))
            books.add(Book("Atomic  34", "James Clear", 2015, "https://imgv3.fotor.com/images/gallery/Childrens-Book-Covers.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.RELIGIOUS ))
            books.add(Book("Atomic 35", "James Clear", 2015, "https://www.adobe.com/express/create/cover/media_178ebed46ae02d6f3284c7886e9b28c5bb9046a02.jpeg?width=400&format=jpeg&optimize=medium", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.RELIGIOUS ))
            books.add(Book("Atomic  36", "James Clear", 2015, "https://marketplace.canva.com/EAD7WuSVrt0/1/0/1003w/canva-colorful-illustration-young-adult-book-cover-LVthABb24ik.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.ROMANCE ))
            books.add(Book("Atomic  37", "James Clear", 2015, "https://images-platform.99static.com//6ELqOlDZNAkWKAlKTT3XjDPSZ_c=/fit-in/590x590/projects-files/83/8342/834261/bc96e38c-765d-4031-a33f-b03eb49bca14.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.ROMANCE ))
            books.add(Book("Atomic 38", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-3-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.ROMANCE ))
            books.add(Book("Atomic 39", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-2-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.THRILLER ))
            books.add(Book("Atomic 40", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.THRILLER ))
            books.add(Book("Habits 41", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.THRILLER ))
            books.add(Book("Atomic  42", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.THRILLER ))
            books.add(Book("Atomic  43", "James Clear", 2015, "https://imgv3.fotor.com/images/gallery/Childrens-Book-Covers.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.THRILLER ))
            if (genre == Genre.ALL) return books
            val list = ArrayList<Book>()
            for (i in books){
                if (i.genre == genre){
                    list.add(i)
                }
            }
            return list
        }
        fun initBooks(): ArrayList<Book> {
            val books = ArrayList<Book>()
            books.add(Book("Atomic 1", "James Clear", 2015, "https://edit.org/photos/images/cat/book-covers-big-2019101610.jpg-1300.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic 2", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Habits 3", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  4", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  5", "James Clear", 2015, "https://imgv3.fotor.com/images/gallery/Childrens-Book-Covers.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.ARTS ))
            books.add(Book("Atomic 6", "James Clear", 2015, "https://www.adobe.com/express/create/cover/media_178ebed46ae02d6f3284c7886e9b28c5bb9046a02.jpeg?width=400&format=jpeg&optimize=medium", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.ARTS ))
            books.add(Book("Atomic  7", "James Clear", 2015, "https://marketplace.canva.com/EAD7WuSVrt0/1/0/1003w/canva-colorful-illustration-young-adult-book-cover-LVthABb24ik.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.CRIME ))
            books.add(Book("Atomic  8", "James Clear", 2015, "https://images-platform.99static.com//6ELqOlDZNAkWKAlKTT3XjDPSZ_c=/fit-in/590x590/projects-files/83/8342/834261/bc96e38c-765d-4031-a33f-b03eb49bca14.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.CRIME ))
            books.add(Book("Atomic 9", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-3-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.CRIME ))
            books.add(Book("Atomic 10", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-2-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.CRIME ))
            books.add(Book("Atomic 11", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.BIOGRAPHY ))
            books.add(Book("Habits 12", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.BIOGRAPHY ))
            books.add(Book("Atomic  13", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  14", "James Clear", 2015, "https://imgv3.fotor.com/images/gallery/Childrens-Book-Covers.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic 15", "James Clear", 2015, "https://www.adobe.com/express/create/cover/media_178ebed46ae02d6f3284c7886e9b28c5bb9046a02.jpeg?width=400&format=jpeg&optimize=medium", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  16", "James Clear", 2015, "https://marketplace.canva.com/EAD7WuSVrt0/1/0/1003w/canva-colorful-illustration-young-adult-book-cover-LVthABb24ik.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.DRAMA ))
            books.add(Book("Atomic  17", "James Clear", 2015, "https://images-platform.99static.com//6ELqOlDZNAkWKAlKTT3XjDPSZ_c=/fit-in/590x590/projects-files/83/8342/834261/bc96e38c-765d-4031-a33f-b03eb49bca14.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.DRAMA ))
            books.add(Book("Atomic 18", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-3-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.DRAMA ))
            books.add(Book("Atomic 19", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-2-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.DRAMA ))
            books.add(Book("Atomic 20", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.FICTION ))
            books.add(Book("Habits 21", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.FICTION ))
            books.add(Book("Atomic  22", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.FICTION ))
            books.add(Book("Atomic  23", "James Clear", 2015, "https://imgv3.fotor.com/images/gallery/Childrens-Book-Covers.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.FICTION ))
            books.add(Book("Atomic 24", "James Clear", 2015, "https://www.adobe.com/express/create/cover/media_178ebed46ae02d6f3284c7886e9b28c5bb9046a02.jpeg?width=400&format=jpeg&optimize=medium", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.FICTION ))
            books.add(Book("Atomic  25", "James Clear", 2015, "https://marketplace.canva.com/EAD7WuSVrt0/1/0/1003w/canva-colorful-illustration-young-adult-book-cover-LVthABb24ik.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.MYSTERY ))
            books.add(Book("Atomic  26", "James Clear", 2015, "https://images-platform.99static.com//6ELqOlDZNAkWKAlKTT3XjDPSZ_c=/fit-in/590x590/projects-files/83/8342/834261/bc96e38c-765d-4031-a33f-b03eb49bca14.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.MYSTERY ))
            books.add(Book("Atomic 27", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-3-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.MYSTERY ))
            books.add(Book("Atomic 28", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-2-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.MYSTERY ))
            books.add(Book("Atomic 29", "James Clear", 2015, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnp2Ikb9FcID_8z_ENNTQsePDW2wrUE818OcGgAWqEVej0dDzGIdKW4W6YXJmcZKwI2ww&usqp=CAU", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.POETRY ))
            books.add(Book("Atomic 30", "James Clear", 2015, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnp2Ikb9FcID_8z_ENNTQsePDW2wrUE818OcGgAWqEVej0dDzGIdKW4W6YXJmcZKwI2ww&usqp=CAU", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.POETRY ))
            books.add(Book("Atomic 31", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.POETRY ))
            books.add(Book("Habits 32", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.POETRY ))
            books.add(Book("Atomic  33", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.RELIGIOUS ))
            books.add(Book("Atomic  34", "James Clear", 2015, "https://imgv3.fotor.com/images/gallery/Childrens-Book-Covers.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.RELIGIOUS ))
            books.add(Book("Atomic 35", "James Clear", 2015, "https://www.adobe.com/express/create/cover/media_178ebed46ae02d6f3284c7886e9b28c5bb9046a02.jpeg?width=400&format=jpeg&optimize=medium", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.RELIGIOUS ))
            books.add(Book("Atomic  36", "James Clear", 2015, "https://marketplace.canva.com/EAD7WuSVrt0/1/0/1003w/canva-colorful-illustration-young-adult-book-cover-LVthABb24ik.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.ROMANCE ))
            books.add(Book("Atomic  37", "James Clear", 2015, "https://images-platform.99static.com//6ELqOlDZNAkWKAlKTT3XjDPSZ_c=/fit-in/590x590/projects-files/83/8342/834261/bc96e38c-765d-4031-a33f-b03eb49bca14.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.ROMANCE ))
            books.add(Book("Atomic 38", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-3-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.ROMANCE ))
            books.add(Book("Atomic 39", "James Clear", 2015, "https://www.mswordcoverpages.com/wp-content/uploads/2018/10/Book-cover-page-2-CRC.png", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.THRILLER ))
            books.add(Book("Atomic 40", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.THRILLER ))
            books.add(Book("Habits 41", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.THRILLER ))
            books.add(Book("Atomic  42", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.THRILLER ))
            books.add(Book("Atomic  43", "James Clear", 2015, "https://imgv3.fotor.com/images/gallery/Childrens-Book-Covers.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.THRILLER ))
            return books
        }


        fun getMyLibrary1(): ArrayList<Book> {
            val books = ArrayList<Book>()
            books.add(Book("Atomic Habits", "James Clear", 2015, "https://edit.org/photos/images/cat/book-covers-big-2019101610.jpg-1300.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic", "James Clear", 2015, "https://cdn.cp.adobe.io/content/2/rendition/9231d555-36b8-43cf-9270-e0adfb6a9564/artwork/ea997594-eee5-44dd-9a88-bc5fd31abb80/version/0/format/jpg/dimension/width/size/400", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Habits", "James Clear", 2015, "https://i.pinimg.com/originals/a1/f8/87/a1f88733921c820db477d054fe96afbb.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            books.add(Book("Atomic  12312", "James Clear", 2015, "https://www.creativeparamita.com/wp-content/uploads/2022/07/takes-time.jpg", "Bu kitob lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum", 3.4, Genre.PHYLOSOPHY ))
            return books
        }
        fun getMyWishList(): ArrayList<Book> {
            return wishLIst
        }
        fun updateWishList(book: Book): ArrayList<Book> {
            if (wishLIst.contains(book)){
                wishLIst.remove(book)
            }else{
                wishLIst.add(book)
            }
            return wishLIst
        }
    }
}