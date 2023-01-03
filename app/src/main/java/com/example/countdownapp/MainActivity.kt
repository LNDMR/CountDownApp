package com.example.countdownapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleText = findViewById<TextView>(R.id.title_text)
        val currentNumberOfDays = findViewById<TextView>(R.id.currentNumberOfDays_text)
        val countedContent = findViewById<TextView>(R.id.countedContent_text)
        val button = findViewById<Button>(R.id.button)

        var counter = 28
        currentNumberOfDays.text = counter.toString()

        button.setOnClickListener {
            counter--
            if(counter >=1){
                button.text = "another day has passed"
            }
            currentNumberOfDays.text = counter.toString()
            if (counter == 1){
                countedContent.text = "day"
            } else if (counter == 0){
                counter = 30
                titleText.text = "TIME FOR VACATION"
                currentNumberOfDays.text = "0"
                countedContent.text = "days"
                button.text = "NEXT VACAY"
            } else {
                titleText.text = "Vacay - Count Down"
            }
        }
    }
}