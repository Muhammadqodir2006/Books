package uz.itschool.books.home

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import uz.itschool.books.*
import uz.itschool.books.library.MyLibraryRecyclerAdapter

class BooksRecycler(val context: Context, genre: Genre, val discoverListener: MyLibraryRecyclerAdapter.DiscoverListener) : RecyclerView.Adapter<BooksRecycler.ViewHolder>() {
    private val bookList = BookAPI.getBooks(genre)
    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val image:ImageView = itemView.findViewById(R.id.imagE)
        val bookName:TextView = itemView.findViewById(R.id.bookName)
        val authorName:TextView = itemView.findViewById(R.id.author)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.home_book_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = bookList[position]
        holder.bookName.text = book.name
        holder.authorName.text = book.author
        holder.image.load(book.image){
            placeholder(R.drawable.logo2)
            error(R.drawable.logo1)
        }
        holder.itemView.setOnClickListener {
            discoverListener.startBookPage(book)
        }
    }

    override fun getItemCount(): Int {
        return bookList.size
    }
    fun putBook(book: Book){
        val intent = Intent()
        intent.putExtra("book", book)

    }
}