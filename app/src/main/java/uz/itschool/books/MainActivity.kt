package uz.itschool.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import uz.itschool.books.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)






        setContentView(binding.root)

        tabLayout = binding.tabLayout
        viewPager2 = binding.viewpager

        val adapter = FragmentAdapter(applicationContext, supportFragmentManager, lifecycle)

        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2){tab, position->
            when (position){
                0 -> {
                    tab.text = "Library"
                    tab.setIcon(R.drawable.icon_library)
                }
                1 -> {
                    tab.text = "Home"
                    tab.setIcon(R.drawable.home_icon)
                }
                2 -> {
                    tab.text = "Comments"
                    tab.setIcon(R.drawable.comments_icon)
                }
            }
        }.attach()




    }
}