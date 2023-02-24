package uz.itschool.books.home

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

class HomeFragment : Fragment() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2 : ViewPager2

    private lateinit var binding: FragmentHomeBinding
    private var genres = arrayOf("All", "Arts", "Biography", "Romance", "Thriller", "Fiction", "Crime", "Religious", "Mystery", "Drama", "Poetry")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentHomeBinding.inflate(layoutInflater)

        tabLayout = binding.tabLayout
        viewPager2 = binding.viewPager

        val adapter = GenreFragmentAdapter(parentFragmentManager, lifecycle, genres)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2){tab, position->
            tab.text = genres[position]
            tab.setIcon(R.drawable.home_icon)
        }.attach()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}