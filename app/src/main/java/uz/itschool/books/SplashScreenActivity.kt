package uz.itschool.books

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import uz.itschool.books.databinding.ActivitySplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
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
        val data: String = sharedPreferences.getString("loggedInUser", "")!!
        val gson = Gson()

        val typeToken = object : TypeToken<User>(){}.type
        if (data.isEmpty()) {
            startActivity(Intent(this, SignInActivity::class.java))
        }else {
            val user = gson.fromJson<User>(data, typeToken)
            val intent = Intent()
            intent.putExtra("loggedInUser", user.username)
            startActivity(Intent(this, MainActivity::class.java))
        }

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        finish()
    }
}