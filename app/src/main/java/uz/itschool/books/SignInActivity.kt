package uz.itschool.books

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import uz.itschool.books.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    private var usersList = ArrayList<User>()

    private lateinit var password1 : TextInputEditText
    private lateinit var username1 : TextInputEditText

    private lateinit var signUp : MaterialButton
    private lateinit var signIn : MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        usersList = getUsers()

        password1 = binding.password1
        username1 = binding.username1
        signUp = binding.signUp
        signIn = binding.signIn

        signIn.setOnClickListener {
            usersList = getUsers()
            val myUsername = username1.text.toString().trim()
            val myPassword = password1.text.toString().trim()
            val usernames = ArrayList<String>()
            val emails = ArrayList<String>()
            for (i in usersList) {
                usernames.add(i.username)
                emails.add(i.email)
            }
            var id:Int = -1
            for (i in usernames.indices){
                val a = usernames[i]
                if (a == myUsername) {
                    id = i
                }
            }
            for (i in emails.indices){
                val a = emails[i]
                if (a == myUsername) {
                    id = i
                }
            }

            if (id == -1){
                Toast.makeText(applicationContext, "Incorrect username or email", Toast.LENGTH_LONG).show()
                password1.text?.clear()
                return@setOnClickListener
            }
            if (id  > 0 && usersList[id].password != myPassword){
                Toast.makeText(applicationContext, "Incorrect password", Toast.LENGTH_LONG).show()
                password1.text?.clear()
                return@setOnClickListener
            }
            val loggedInUser = usersList[id]

            val gson = Gson()
            val sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)
            val edit = sharedPreferences.edit()
            val user:String = gson.toJson(loggedInUser)
            edit.putString("users", user).apply()

            val a  = Intent(applicationContext, MainActivity::class.java)
            a.putExtra("loggedInUser", loggedInUser.username)

            startActivity(a)
            finish()
        }

        signUp.setOnClickListener{
            val a = Intent(applicationContext, SignUpActivity::class.java)
            startActivity(a)
        }

    }

    private fun getUsers(): ArrayList<User> {
        val sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)
        val gson = Gson()
        val data: String = sharedPreferences.getString("users", "")!!
        val typeToken = object : TypeToken<ArrayList<User>>() {}.type
        if (data.isEmpty()) return ArrayList()
        return gson.fromJson(data, typeToken)

    }
}