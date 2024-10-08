package uz.itschool.books.home

import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.itschool.books.Genre
import uz.itschool.books.library.MyLibraryRecyclerAdapter

class GenreFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle, val context: Context, val discoverListener: MyLibraryRecyclerAdapter.DiscoverListener) : FragmentStateAdapter(fragmentManager, lifecycle) {
    val genresList = Genre.values().toList()

    override fun getItemCount(): Int {
        return genresList.size
    }

    override fun createFragment(position: Int): Fragment {

        return GenreFragment(genresList[position], context, discoverListener)
    }
}