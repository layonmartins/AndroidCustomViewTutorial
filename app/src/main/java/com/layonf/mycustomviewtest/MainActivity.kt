package com.layonf.mycustomviewtest

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Initialize a new GradientDrawable
        val gd = GradientDrawable().apply{
            setGradientType(GradientDrawable.RECTANGLE)
            // Set GradientDrawable shape is a rectangle
            setShape(GradientDrawable.LINEAR_GRADIENT)
        }

        happyButton.setOnClickListener({
            emotionalFaceView.happinessState = EmotionalFaceView.HAPPY
            textView.setText("Happy view")
            gd.colors = intArrayOf(Color.YELLOW, Color.WHITE)
            relativeLayout.setBackgroundDrawable(gd)
        })
        neutralButton.setOnClickListener({
            emotionalFaceView.happinessState = EmotionalFaceView.NEUTRAL
            textView.setText("Neutral view")
            gd.colors = intArrayOf(Color.WHITE, Color.WHITE)
            relativeLayout.setBackgroundDrawable(gd)
        })
        sadButton.setOnClickListener({
            emotionalFaceView.happinessState = EmotionalFaceView.SAD
            textView.setText("Sad view")
            gd.colors = intArrayOf(Color.GRAY, Color.WHITE)
            relativeLayout.setBackgroundDrawable(gd)
        })
    }
}