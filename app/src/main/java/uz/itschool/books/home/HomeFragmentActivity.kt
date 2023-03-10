package uz.itschool.books.home

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import uz.itschool.books.Genre
import uz.itschool.books.R
import uz.itschool.books.databinding.FragmentHomeBinding
import uz.itschool.books.library.MyLibraryRecyclerAdapter

class HomeFragmentActivity(val contexT: Context,val discoverListener: MyLibraryRecyclerAdapter.DiscoverListener) : Fragment(R.layout.fragment_home) {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2

    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(layoutInflater)

        tabLayout = binding.tabLayout
        viewPager2 = binding.viewPager

        val adapter = GenreFragmentAdapter(childFragmentManager, lifecycle, contexT, discoverListener)

//        childFragmentManager.beginTransaction().apply {
//            add(R.id.container, BlankFragment1())
//            commit()
//        }
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            val genres = Genre.values().toList()
            tab.text = genres[position].nomi
        }.attach()





        return binding.root
    }

}