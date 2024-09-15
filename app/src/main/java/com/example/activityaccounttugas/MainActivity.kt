package com.example.activityaccounttugas

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivityLifecycle"
    private lateinit var username: EditText
    private lateinit var email: EditText
    private lateinit var phone: EditText
    private lateinit var password: EditText
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: dipanggil")
        // Inisialisasi komponen
        username = findViewById(R.id.et_username)
        email = findViewById(R.id.et_email)
        phone = findViewById(R.id.et_phone)
        password = findViewById(R.id.et_password)
        btnRegister = findViewById(R.id.btn_register)

        // Saat tombol registrasi ditekan
        btnRegister.setOnClickListener {
            val usernameInput = username.text.toString()
            val emailInput = email.text.toString()
            val phoneInput = phone.text.toString()

            if (usernameInput.isNotEmpty() && emailInput.isNotEmpty() && phoneInput.isNotEmpty()) {
                // Kirim data ke SecondActivity
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("username", usernameInput)
                intent.putExtra("email", emailInput)
                intent.putExtra("phone", phoneInput)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: dipanggil")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: dipanggil")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: dipanggil")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: dipanggil")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: dipanggil")
    }
}