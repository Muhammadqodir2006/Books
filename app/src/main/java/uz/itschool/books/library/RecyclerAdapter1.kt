package uz.itschool.books.library

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.itschool.books.BookAPI
import uz.itschool.books.R

class RecyclerAdapter1 : RecyclerView.Adapter<RecyclerAdapter1.ViewHolder>() {
    val bookList = BookAPI.getMyLibrary()
    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.my_library_recyclerview_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = bookList[position]
        holder.itemView.
    }

    override fun getItemCount(): Int {
        return bookList.size
    }
}