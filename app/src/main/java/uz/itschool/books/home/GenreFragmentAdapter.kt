package uz.itschool.books.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.itschool.books.Genre

class GenreFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle, var genreList: Array<String>) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return genreList.size
    }

    override fun createFragment(position: Int): Fragment {
        return GenreFragment(genreList[position])
    }
}