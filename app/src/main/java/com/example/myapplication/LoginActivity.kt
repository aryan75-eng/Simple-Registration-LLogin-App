package com.example.myapplication


import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(
            R.layout.activity_login
        )


        val login =
            findViewById<Button>(
                R.id.loginButton
            )



        login.setOnClickListener {


            Toast.makeText(
                this,
                "Login Successful",
                Toast.LENGTH_SHORT
            ).show()


        }


    }

}