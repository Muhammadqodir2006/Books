package uz.itschool.books.library

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import uz.itschool.books.Book
import uz.itschool.books.R
import uz.itschool.books.databinding.MyLibraryListview1ItemBinding

class ListView1Adapter(context: Context, var books : ArrayList<Book>) : ArrayAdapter<Book>(context, R.layout.my_library_listview1_item) {
    override fun getCount(): Int {
        return books.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val book = books[position]
        val view : MyLibraryListview1ItemBinding
        if (convertView == null){
            view = MyLibraryListview1ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        }else{
            view = MyLibraryListview1ItemBinding.bind(convertView)
        }
        view.bookName.text = book.name


        return view.root
    }
}