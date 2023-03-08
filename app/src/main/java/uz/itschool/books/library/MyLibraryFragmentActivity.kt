package uz.itschool.books.library

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.itschool.books.R
import uz.itschool.books.databinding.FragmentMyLibraryBinding

class MyLibraryFragmentActivity(val contexT: Context) : Fragment() {
    private lateinit var myWishList_recyclerView : RecyclerView
    private lateinit var myLibrary_recyclerView : RecyclerView
    private lateinit var binding: FragmentMyLibraryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentMyLibraryBinding.inflate(layoutInflater)
        myLibrary_recyclerView = binding.myLibraryRecyclerView
        myWishList_recyclerView = binding.myWishListRecyclerView

        myLibrary_recyclerView.layoutManager = LinearLayoutManager(contexT, LinearLayoutManager.HORIZONTAL, false)
        myLibrary_recyclerView.adapter = MyLibraryRecyclerAdapter(contexT)

        myWishList_recyclerView.layoutManager = GridLayoutManager(contexT, 2, GridLayoutManager.VERTICAL, false)
        myWishList_recyclerView.adapter = MyWishlistRecyclerAdapter1(contexT)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_library, container, false)
    }

}