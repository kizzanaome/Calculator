package com.noma.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Image view*/
        val image = findViewById<ImageView>(R.id.my_image)
        /** edit texts */
        val firstNumberEditText = findViewById<EditText>(R.id.first_number)
        val secondNumberEditText:EditText = findViewById(R.id.second_number)

        /** Buttons */
        val sumButton:Button = findViewById(R.id.sum_button)
        val subtractButton:Button = findViewById(R.id.subtract_button)
        val divideButton:Button = findViewById(R.id.division_button)
        val multiplyButton:Button = findViewById(R.id.multiply_button)

        /** Text View */
        val answerText:TextView = findViewById(R.id.answer)

        sumButton.setOnClickListener {
            val firstNumber = firstNumberEditText.text.toString().toInt()
            val secondNumber = secondNumberEditText.text.toString().toInt()
            val sum = firstNumber + secondNumber
            answerText.setText("The sum is $sum")
        }


        subtractButton.setOnClickListener {
            val firstNumber = firstNumberEditText.text.toString().toInt()
            val secondNumber = secondNumberEditText.text.toString().toInt()
            val difference = firstNumber - secondNumber
            answerText.setText("The difference is $difference")
        }

        divideButton.setOnClickListener {
            val firstNumber = firstNumberEditText.text.toString().toInt().toDouble()
            val secondNumber = secondNumberEditText.text.toString().toInt().toDouble()
            val devide =  secondNumber /firstNumber
            answerText.setText(" $secondNumber devide by $firstNumber =  $devide")
        }

        multiplyButton.setOnClickListener {
            val firstNumber = firstNumberEditText.text.toString().toInt().toDouble()
            val secondNumber = secondNumberEditText.text.toString().toInt().toDouble()
            val multiply =  secondNumber * firstNumber
            answerText.setText(" The product is  $multiply")
        }

        answerText.setOnClickListener{
            image.setImageResource(R.drawable.logo)
        }


    }
}