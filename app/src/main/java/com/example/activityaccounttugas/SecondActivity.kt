package com.example.activityaccounttugas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Inisialisasi komponen
        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        btnLogin = findViewById(R.id.btn_login)

        // Ambil data dari MainActivity
        val username = intent.getStringExtra("username")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")

        // Saat tombol login ditekan
        btnLogin.setOnClickListener {
            val inputUsername = usernameInput.text.toString()
            val inputPassword = passwordInput.text.toString()

            if (inputUsername == username && inputPassword.isNotEmpty()) {
                // Kirim data ke ThirdActivity
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("username", username)
                intent.putExtra("email", email)
                intent.putExtra("phone", phone)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Username or password incorrect", Toast.LENGTH_SHORT).show()
            }
        }
    }
}