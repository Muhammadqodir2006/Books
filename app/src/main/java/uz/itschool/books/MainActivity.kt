package uz.itschool.books

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import uz.itschool.books.databinding.ActivityMainBinding
import uz.itschool.books.library.MyLibraryRecyclerAdapter
import uz.itschool.books.library.MyWishlistRecyclerAdapter1
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var curLang:String
//    private val loggedInUsername = intent.getStringExtra("loggedInUser")

    private lateinit var menuButton : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        menuButton = binding.menuButton


        tabLayout = binding.tabLayout
        viewPager2 = binding.viewpager

        curLang = getCurLang()

        val adapter = FragmentAdapter(applicationContext, supportFragmentManager, lifecycle, object :
            MyLibraryRecyclerAdapter.DiscoverListener {
            override fun onClick() {
                tabLayout.selectTab(tabLayout.getTabAt(1), true)
            }

            override fun startBookPage(book: Book) {
                val i = Intent(applicationContext, BookPageActivity::class.java)
                i.putExtra("book", book)
                startActivity(i)
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
                if (popUp.menu.getItem(2) == item){
                    val a = Intent(applicationContext, SignInActivity::class.java)
                    val sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)
                    val edit = sharedPreferences.edit()
                    edit.putString("loggedInUser", "").apply()
                    startActivity(a)
                    finish()
                }else{
                    if (popUp.menu.getItem(0) == item){
                        setLocale("uz")
                    }else if (popUp.menu.getItem(1) == item){
                        setLocale("en")
                    }
                }
                true
            })
            popUp.show()
        }
    }

    private fun getCurLang(): String {
        val sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)
        curLang = sharedPreferences.getString("curLang", "")!!
        return curLang
    }

    private fun setLocale(localeName: String) {
        if (localeName != curLang) {
            val locale = Locale(localeName)
            val res = resources
            val dm = res.displayMetrics
            val conf = res.configuration
            conf.locale = locale
            res.updateConfiguration(conf, dm)
            val refresh = Intent(
                this,
                MainActivity::class.java
            )
            refresh.putExtra(curLang, localeName)
            startActivity(refresh)
            putCurLang(localeName)

        } else {
            Toast.makeText(
                this, curLang, Toast.LENGTH_SHORT).show();
        }
    }
    fun putCurLang(lang:String){
        val sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)
        val edit = sharedPreferences.edit()
        edit.putString("curLang",lang).apply()
    }

}