package uz.itschool.books

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.PopupMenu
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import uz.itschool.books.databinding.ActivityMainBinding
import uz.itschool.books.library.MyLibraryRecyclerAdapter
import uz.itschool.books.library.MyWishlistRecyclerAdapter1

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
//    private val loggedInUsername = intent.getStringExtra("loggedInUser")

    private lateinit var menuButton : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        menuButton = binding.menuButton


        tabLayout = binding.tabLayout
        viewPager2 = binding.viewpager

        val adapter = FragmentAdapter(applicationContext, supportFragmentManager, lifecycle, object :
            MyLibraryRecyclerAdapter.DiscoverListener {
            override fun onClick() {
                tabLayout.selectTab(tabLayout.getTabAt(1), true)
            }

        })

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

        menuButton.setOnClickListener {
            val popUp = PopupMenu(applicationContext, menuButton)
            popUp.inflate(R.menu.main_menu)
            popUp.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {item: MenuItem? ->
                val a = Intent(applicationContext, SignInActivity::class.java)
                startActivity(a)
                finish()
                true
            })
            popUp.show()
        }
    }

}