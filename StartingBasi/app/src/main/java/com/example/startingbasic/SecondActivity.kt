package com.example.startingbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val messageButton = findViewById<Button>(R.id.messageButton)
        val Previous = findViewById<Button>(R.id.backbutton)

        messageButton.setOnClickListener {
            // Display a toast message when the button is clicked
            Toast.makeText(this@SecondActivity, "Congratulations for making your first app!", Toast.LENGTH_SHORT).show()
        }


        Previous.setOnClickListener {
            // Create an Intent to start SecondActivity
            // 'this' refers to the current Activity (SecondActivivty in this case)
            // MainActivity::class.java specifies the target activity to start
            val intent = Intent(this, MainActivity::class.java)

            // Use the startActivity method to start the new activity
            // The intent parameter contains the information about which activity to start
            startActivity(intent)
        }
    }



    }
