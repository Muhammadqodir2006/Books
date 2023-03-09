package uz.itschool.books.library

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import uz.itschool.books.BookAPI
import uz.itschool.books.BookPageActivity
import uz.itschool.books.R

class MyLibraryRecyclerAdapter(val context: Context, val discoverListener: DiscoverListener) : RecyclerView.Adapter<MyLibraryRecyclerAdapter.ViewHolder>() {
    private val bookList = BookAPI.getMyLibrary()
    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val image:ImageView = itemView.findViewById(R.id.imagE_lib)
        val bookName:TextView = itemView.findViewById(R.id.bookName_lib)

        val discover : ConstraintLayout = itemView.findViewById(R.id.discover)
        val bookView : ConstraintLayout = itemView.findViewById(R.id.book)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.library_my_library_recyclerview_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (position == bookList.size) {
            holder.discover.visibility = View.VISIBLE
            holder.bookView.visibility = View.GONE
            holder.discover.setOnClickListener {
                discoverListener.onClick()
            }
        }else{
            val book = bookList[position]
//        holder.itemView.setOnClickListener {
//            val a = Intent(context, BookPageActivity(bookList[position])::class.java)
//            context.startActivity(a)
//        }
            holder.bookName.text = book.name
            holder.image.load(book.image){
                placeholder(R.drawable.logo2)
                error(R.drawable.logo1)
            }
        }

    }

    override fun getItemCount(): Int {
        return bookList.size+1
    }
    interface DiscoverListener {
        fun onClick()
    }
}