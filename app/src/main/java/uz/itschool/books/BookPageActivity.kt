package uz.itschool.books

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import uz.itschool.books.databinding.ActivityBookPageBinding

class BookPageActivity() : AppCompatActivity() {

    private lateinit var binding: ActivityBookPageBinding

    private lateinit var bookName: TextView
    private lateinit var authorName: TextView
    private lateinit var readsCount: TextView
    private lateinit var about: TextView

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
//    val bookInfo = intent.getStringArrayListExtra("bookInfo")!!


    private lateinit var bookBackImage: ImageView
    private lateinit var authorImage: ImageView

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bookName = binding.bookName
        authorName = binding.authorName
        readsCount = binding.howManyReads
        about = binding.about

        binding.backButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

//        bookName.text = bookInfo[0]
//        authorName.text = bookInfo[1]
//        about.text = bookInfo[2]
    }
}