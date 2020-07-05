package com.example.quiz_app.features.quiz_questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.quiz_app.Constants
import com.example.quiz_app.R

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        startQuestions()
    }

    private fun startQuestions(){
        val questionsList = Constants.getQuestion()
        Log.i("Questions size: ", "${questionsList.size}")
    }
}