package uz.itschool.books

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import uz.itschool.books.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySignUpBinding

    private var usersList = ArrayList<User>()

    private lateinit var username : TextInputEditText
    private lateinit var password : TextInputEditText
    private lateinit var email : TextInputEditText
    private lateinit var createAccount : MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        usersList = getUsers()
        username = binding.username
        password = binding.password
        email = binding.email
        createAccount = binding.createAccount

        onBackPressedDispatcher.addCallback(this,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    val gson = Gson()
                    val sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)
                    val data: String = sharedPreferences.getString("loggedInUser", "")!!
                    val typeToken = object  : TypeToken<ArrayList<User>>(){}.type
                    if (data.isEmpty()) {
                        startActivity(Intent(applicationContext, SignInActivity::class.java))
                        finish()
                    }
                    startActivity(Intent(applicationContext, CheckPassword::class.java))
                    finish()

                }
            })

        createAccount.setOnClickListener{
            val myUsername = username.text.toString().trim()
            val myEmail = email.text.toString().trim()
            val myPassword = password.text.toString().trim()
            val usernames = ArrayList<String>()
            val emails = ArrayList<String>()
            for (i in usersList){
                usernames.add(i.username)
                emails.add(i.email)
            }
            if (usernames.contains(myUsername)){
                Toast.makeText(applicationContext, "Username already exists", Toast.LENGTH_LONG).show()
                username.text?.clear()
                return@setOnClickListener
            }
            if (!myEmail.contains('@')){
                Toast.makeText(applicationContext, "Email address must contain '@' sign", Toast.LENGTH_LONG).show()
                email.text?.clear()
                return@setOnClickListener
            }
            if (emails.contains(myEmail)){
                Toast.makeText(applicationContext, "This email is already registered", Toast.LENGTH_LONG).show()
                email.text?.clear()
                return@setOnClickListener
            }
            if (myPassword.length < 8){
                Toast.makeText(applicationContext, "Password must contain al least 8 characters", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            signUp(User(myUsername, myEmail, myPassword))
        }
    }

    private fun signUp(user: User){
        val gson = Gson()
        val sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)
        val edit = sharedPreferences.edit()
        usersList.add(user)
        val list:String = gson.toJson(usersList)
        edit.putString("loggedInUser",gson.toJson(user)).apply()
        edit.putString("users", list).apply()
        Toast.makeText(applicationContext, "Successfully signed up", Toast.LENGTH_SHORT).show()
        val a  = Intent(applicationContext, MainActivity::class.java)
        a.putExtra("loggedInUser", user.username)
        startActivity(a)
        finish()
    }
    private fun getUsers(): ArrayList<User> {
        val gson = Gson()
        val sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)
        val data: String = sharedPreferences.getString("users", "")!!
        val typeToken = object  : TypeToken<ArrayList<User>>(){}.type
        if (data.isEmpty()) return ArrayList()
        return gson.fromJson(data, typeToken)
    }
}