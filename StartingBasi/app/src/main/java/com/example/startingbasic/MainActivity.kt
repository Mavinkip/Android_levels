package com.example.startingbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Retrieves references to the UI elements using their IDs
        val number1EditText = findViewById<EditText>(R.id.number1) // EditText for first number
        val number2EditText = findViewById<EditText>(R.id.number2) // EditText for second number
        val addButton = findViewById<Button>(R.id.addButton)
        val nextButton = findViewById<Button>(R.id.nextButton) // Button to perform addition
        val subtractButton = findViewById<Button>(R.id.subtractButton) // Button to perform subtraction
        val resultTextView = findViewById<TextView>(R.id.resultTextView) // TextView to display the result


        // Sets an OnClickListener on the addButton to perform addition when clicked
        addButton.setOnClickListener {
            // Retrieves and converts the input from the EditTexts to Double
            val number1 = number1EditText.text.toString().toDoubleOrNull()
            val number2 = number2EditText.text.toString().toDoubleOrNull()

            // Checks if both inputs are valid numbers
            if (number1 != null && number2 != null) {
                // Performs addition and updates the resultTextView with the result
                val result = number1 + number2
                resultTextView.text = "Result: $result"
            } else {
                // Displays an error message if the inputs are not valid numbers
                resultTextView.text = "Please enter valid numbers"
            }
        }


            // Sets an OnClickListener on the subtractButton to perform subtraction when clicked
            subtractButton.setOnClickListener {
                // Retrieves and converts the input from the EditTexts to Double
                val number1 = number1EditText.text.toString().toDoubleOrNull()
                val number2 = number2EditText.text.toString().toDoubleOrNull()

                // Checks if both inputs are valid numbers
                if (number1 != null && number2 != null) {
                    // Performs subtraction and updates the resultTextView with the result
                    val result = number1 - number2
                    resultTextView.text = "Result: $result"
                } else {
                    // Displays an error message if the inputs are not valid numbers
                    resultTextView.text = "Please enter valid numbers"
                }
            }
        // Set an OnClickListener on the nextButton
        nextButton.setOnClickListener {
            // Create an Intent to start SecondActivity
            // 'this' refers to the current Activity (MainActivity in this case)
            // SecondActivity::class.java specifies the target activity to start
            val intent = Intent(this, SecondActivity::class.java)

            // Use the startActivity method to start the new activity
            // The intent parameter contains the information about which activity to start
            startActivity(intent)
        }

        }



    }
