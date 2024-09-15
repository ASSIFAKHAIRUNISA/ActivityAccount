package com.example.activityaccounttugas

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    private lateinit var usernameView: TextView
    private lateinit var emailView: TextView
    private lateinit var phoneView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

            // Inisialisasi komponen
            usernameView = findViewById(R.id.username)
            emailView = findViewById(R.id.email)
            phoneView = findViewById(R.id.phone)

            // Ambil data dari SecondActivity
            val username = intent.getStringExtra("username")
            val email = intent.getStringExtra("email")
            val phone = intent.getStringExtra("phone")

            // Tampilkan data
            usernameView.text = "Welcome $username"
            emailView.text = "Your $email has been activated"
            phoneView.text = "Your $phone has been registered"
    }
}