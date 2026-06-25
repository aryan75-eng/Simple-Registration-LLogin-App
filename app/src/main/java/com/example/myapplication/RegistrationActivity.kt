package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class RegistrationActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(
            R.layout.activity_registration
        )


        val submit =
            findViewById<Button>(
                R.id.submit
            )


        submit.setOnClickListener {


            Toast.makeText(
                this,
                "Registration Successful",
                Toast.LENGTH_SHORT
            ).show()


            val intent =
                Intent(
                    this,
                    LoginActivity::class.java
                )


            startActivity(intent)


        }


    }

}