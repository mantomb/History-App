package com.example.hstoryapp

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android .os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun
            onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val findButton =
            findViewById<Button>(R.id.findButton)
        findButton.setOnClickListener {

        }
        val clearButton =
            findViewById<Button>(R.id.clearButton)
        val ageInput =
            findViewById<EditText>(R.id.ageInput)
        val resultTextView=
            findViewById<TextView>(R.id.resultTextView2)


        findButton.setOnClickListener {
            val ageString =
                ageInput.text.toString()
            val result =
                findFamousPerson(ageString)
            resultTextView.text = result
        }

        clearButton.setOnClickListener {
            resultTextView.text = ""
        }
    }

    private fun findFamousPerson(
        ageInput:
        String
    ): String {
        val age = ageInput.toIntOrNull()
        if (age != null && age in 20..100) {
            return when (age) {

                83 -> "Thomas Jefferson"

                76 -> "Albert Einstein"

                73 -> "Charles Darwin"

                52 -> "William Shakespeare"

                56 -> "Abraham Lincoln"

                84 -> "Isaac Newton"

                91 -> "John Adams"

                58 -> "Charles Dickens"

                75 -> "Mark Twain"

                38 -> "Joseph Smith"

                else -> "No famous person found at that age."
            }
        } else {
            return "Please enter a valid age between 20 and 100."
        }
    }
}








