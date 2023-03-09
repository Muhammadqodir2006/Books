package uz.itschool.books.library

import android.content.Context
import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import uz.itschool.books.BookAPI
import uz.itschool.books.R

class MyWishlistRecyclerAdapter1(val context: Context) :
    RecyclerView.Adapter<MyWishlistRecyclerAdapter1.ViewHolder>() {
    private val bookList = BookAPI.getMyWishList()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.shapeableImageView2)
        val bookName: TextView = itemView.findViewById(R.id.textView4)
        val authorName: TextView = itemView.findViewById(R.id.textView5)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.library_my_wishlist_recyclerview_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = bookList[position]
        holder.bookName.text = book.name
        holder.authorName.text = book.author
        holder.image.load(book.image) {
            placeholder(R.drawable.logo2)
            error(R.drawable.logo1)
        }


    }

    override fun getItemCount(): Int {
        return bookList.size
    }


}