package uz.itschool.books.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.itschool.books.Genre

class GenreFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return Genre.values().size
    }

    override fun createFragment(position: Int): Fragment {
        return GenreFragment(Genre.values()[position])
    }
}