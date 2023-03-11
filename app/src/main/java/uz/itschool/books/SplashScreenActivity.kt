package uz.itschool.books

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import uz.itschool.books.databinding.ActivitySplashScreenBinding
import java.util.*

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    private lateinit var curLang : String
    private lateinit var binding : ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.logo.alpha = 0f
        binding.logo.animate().setDuration(700).alpha(1f).withEndAction {
           open()
        }
    }
    private fun open(){
        val sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)
        val edit = sharedPreferences.edit()
        val data: String = sharedPreferences.getString("loggedInUser", "")!!
        val gson = Gson()
        val typeToken = object : TypeToken<User>(){}.type

        curLang = sharedPreferences.getString("curLang", "")!!

        if (curLang == ""){
            curLang = "en"
            edit.putString("curLang","en").apply()
        }
        setLocale(curLang)


        if (data == "") {
            startActivity(Intent(this, SignInActivity::class.java))
        }else {
            val user = gson.fromJson<User>(data, typeToken)
            val intent = Intent(this, CheckPassword::class.java)
            intent.putExtra("loggedInUser", user.username)
            intent.putExtra("userPassword", user.password)
            startActivity(intent)
        }

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        finish()
    }
    private fun setLocale(localeName: String) {
            val locale = Locale(localeName)
            val res = resources
            val dm = res.displayMetrics
            val conf = res.configuration
            conf.locale = locale
            res.updateConfiguration(conf, dm)
    }
}