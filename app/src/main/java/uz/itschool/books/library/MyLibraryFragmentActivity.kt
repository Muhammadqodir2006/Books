package uz.itschool.books.library

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import uz.itschool.books.BookAPI
import uz.itschool.books.R
import uz.itschool.books.databinding.FragmentMyLibraryBinding

class MyLibraryFragmentActivity(var contextT: Context) : Fragment() {
    private lateinit var myWishList_recyclerView : RecyclerView
    private lateinit var myLibrary_recyclerView : RecyclerView
    private lateinit var binding: FragmentMyLibraryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentMyLibraryBinding.inflate(layoutInflater)
        myLibrary_recyclerView = binding.myLibraryRecyclerView
        myWishList_recyclerView = binding.myWishListRecyclerView




    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_my_library, container, false)
    }

}