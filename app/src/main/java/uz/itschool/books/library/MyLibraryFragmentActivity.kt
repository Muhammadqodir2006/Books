package uz.itschool.books.library

import android.content.Context
import android.content.SharedPreferences
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

class MyLibraryFragmentActivity(val contexT: Context, val discoverListener: MyLibraryRecyclerAdapter.DiscoverListener, val sharedPreferences: SharedPreferences) : Fragment() {
    private lateinit var myWishList_recyclerView : RecyclerView
    private lateinit var myLibrary_recyclerView : RecyclerView
    private lateinit var binding: FragmentMyLibraryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyLibraryBinding.inflate(layoutInflater)
        myLibrary_recyclerView = binding.myLibraryRecyclerView
        myWishList_recyclerView = binding.myWishListRecyclerView

        myLibrary_recyclerView.layoutManager = LinearLayoutManager(contexT, LinearLayoutManager.HORIZONTAL, false)
        myLibrary_recyclerView.adapter = MyLibraryRecyclerAdapter(contexT, discoverListener)

        myWishList_recyclerView.layoutManager = GridLayoutManager(contexT, 2, GridLayoutManager.VERTICAL, false)
        myWishList_recyclerView.adapter = MyWishlistRecyclerAdapter1(contexT, discoverListener, sharedPreferences)

        return binding.root
    }

}