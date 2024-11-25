package com.example.simpleapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleapp.databinding.ActivityLogin2Binding



class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLogin2Binding
    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.username.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginText.setOnClickListener(View.OnClickListener {
            if (binding.username.text.toString() == "user" && binding.password.text.toString() == "1234") {
                Toast.makeText("Login Succesfull!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText("Login Failed!", Toast.LENGTH_SHORT).show()
            }
        })

    }
}