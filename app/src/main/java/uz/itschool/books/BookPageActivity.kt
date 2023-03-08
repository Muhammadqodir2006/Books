package uz.itschool.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import uz.itschool.books.databinding.ActivityBookPageBinding

class BookPageActivity(val book: Book) : AppCompatActivity() {

    private lateinit var binding: ActivityBookPageBinding

    private lateinit var bookName: TextView
    private lateinit var authorName: TextView
    private lateinit var readsCount: TextView
    private lateinit var about: TextView

    private lateinit var bookBackImage: ImageView
    private lateinit var authorImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bookName = binding.bookName
        authorName = binding.authorName
        readsCount = binding.howManyReads
        about = binding.about

        bookName.text = book.name
        authorName.text = book.author
        about.text = book.about
    }
}