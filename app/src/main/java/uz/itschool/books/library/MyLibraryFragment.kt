package uz.itschool.books.library

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import uz.itschool.books.BookAPI
import uz.itschool.books.R
import uz.itschool.books.databinding.FragmentMyLibraryBinding

class MyLibraryFragment(var contextT: Context) : Fragment() {
    private lateinit var ListView1 : ListView
    private lateinit var binding: FragmentMyLibraryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("TAG", "onCreate: ")
        binding = FragmentMyLibraryBinding.inflate(layoutInflater)
        ListView1 = binding.myLibraryListView1

        val adapter = ListView1Adapter(contextT, BookAPI.getBooks())
        ListView1.adapter = adapter

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_my_library, container, false)
    }

}