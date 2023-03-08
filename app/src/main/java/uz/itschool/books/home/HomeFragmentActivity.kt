package uz.itschool.books.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import uz.itschool.books.R
import uz.itschool.books.databinding.FragmentHomeBinding

class HomeFragmentActivity : Fragment(R.layout.fragment_home) {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2

    private lateinit var binding: FragmentHomeBinding
    private var genres = arrayOf(
        "All",
        "Arts",
        "Biography",
        "Romance",
        "Thriller",
        "Fiction",
        "Crime",
        "Religious",
        "Mystery",
        "Drama",
        "Poetry"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(layoutInflater)

        tabLayout = binding.tabLayout
        viewPager2 = binding.viewPager

        val adapter = GenreFragmentAdapter(
            childFragmentManager, lifecycle, arrayOf(BlankFragment1(), BlankFragment2())
        )
//        childFragmentManager.beginTransaction().apply {
//            add(R.id.container, BlankFragment1())
//            commit()
//        }
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = genres[position]
            tab.setIcon(R.drawable.home_icon)
        }.attach()





        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}