package uz.itschool.books

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import uz.itschool.books.databinding.ActivityCheckPasswordBinding
import uz.itschool.books.databinding.ActivitySignInBinding

class CheckPassword : AppCompatActivity() {

    private lateinit var password1 : TextInputEditText

    private lateinit var signUp : MaterialButton
    private lateinit var signIn : MaterialButton
    private lateinit var go : MaterialButton
    private lateinit var hello:TextView

    lateinit var password : String

    private lateinit var binding: ActivityCheckPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)
        val data: String = sharedPreferences.getString("loggedInUser", "")!!
        val gson = Gson()

        val typeToken = object : TypeToken<User>(){}.type
        val user = gson.fromJson<User>(data, typeToken)

        password = user.password

        hello = binding.Hello
        password1 = binding.password1
        signUp = binding.signUp
        signIn = binding.signIn2
        go = binding.go

        hello.text = "Hello ${user.username}"

        signUp.setOnClickListener {
            startActivity(Intent(applicationContext, SignUpActivity::class.java))
        }
        signIn.setOnClickListener {
            startActivity(Intent(applicationContext, SignInActivity::class.java))
        }
        go.setOnClickListener {
            if (password1.text == null) return@setOnClickListener
            if (password1.text!!.isEmpty()) return@setOnClickListener
            if (password1.text!!.toString() != password){
                Toast.makeText(applicationContext, "Wrong password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            startActivity(Intent(applicationContext, MainActivity::class.java))
            overridePendingTransition(androidx.appcompat.R.anim.abc_fade_in, androidx.appcompat.R.anim.abc_fade_out)
            finish()
        }
    }
}