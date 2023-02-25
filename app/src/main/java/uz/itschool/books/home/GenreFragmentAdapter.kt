package uz.itschool.books.home

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.itschool.books.Genre

class GenreFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle, var fragmentList: Array<Fragment>) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        Log.d("TAG", "createFragment:" + fragmentList[position])
        return fragmentList[position]
    }
}