package uz.itschool.books.home

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.itschool.books.Genre
import uz.itschool.books.R
import uz.itschool.books.databinding.FragmentGenreBinding
import uz.itschool.books.library.MyLibraryRecyclerAdapter

class GenreFragment(val genre:Genre, val contexT: Context, val discoverListener: MyLibraryRecyclerAdapter.DiscoverListener) : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentGenreBinding.inflate(layoutInflater)
        val recyler:RecyclerView = binding.booksRecyclerViewGenre

        recyler.layoutManager = GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false)
        recyler.adapter = BooksRecycler(contexT, genre, discoverListener)

        return binding.root
    }

}