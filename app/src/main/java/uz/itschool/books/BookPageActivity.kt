package uz.itschool.books

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display.Mode
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import coil.api.load
import com.google.android.material.button.MaterialButton
import uz.itschool.books.databinding.ActivityBookPageBinding

class BookPageActivity() : AppCompatActivity() {

    private lateinit var binding: ActivityBookPageBinding

    private lateinit var bookName: TextView
    private lateinit var authorName: TextView
    private lateinit var readsCount: TextView
    private lateinit var about: TextView

    private lateinit var updateButton: MaterialButton

    lateinit var book:Book


    private lateinit var bookBackImage: ImageView
    private lateinit var authorImage: ImageView

    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bookBackImage = binding.bookBackImage
        authorImage = binding.authorImage
        updateButton = binding.updateButton

        book = intent.getSerializableExtra("book") as Book
        bookName = binding.bookName
        authorName = binding.authorName
        readsCount = binding.howManyReads
        about = binding.about

        bookBackImage.load(book.image)
        binding.backButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        if (BookAPI.getMyWishList(getSharedPreferences("data", MODE_PRIVATE)).contains(book)){
            updateButton.text = "Remove from wishlist"
            updateButton.setIconResource(R.drawable.remove)
        }
        updateButton.setOnClickListener {
            BookAPI.updateWishList(book, getSharedPreferences("data", MODE_PRIVATE))
            if (BookAPI.getMyWishList(getSharedPreferences("data", MODE_PRIVATE)).contains(book)){
                updateButton.text = "Remove from wishlist"
                updateButton.setIconResource(R.drawable.remove)
            }else{
                updateButton.text = "Add to wishlist"
                updateButton.setIconResource(R.drawable.add_icon)
            }
        }

        bookName.text = book.name
        authorName.text = book.author
        about.text = book.about
    }

}