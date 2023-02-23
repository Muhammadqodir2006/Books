package uz.itschool.books

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.itschool.books.comments.CommentsFragment
import uz.itschool.books.home.HomeFragment
import uz.itschool.books.library.MyLibraryFragment

class FragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 ->{
                MyLibraryFragment()
            }
            1 ->{
                HomeFragment()
            }
            else ->{
                CommentsFragment()
            }

        }
    }
}