package com.example.quiz_app.features.quiz_questions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.quiz_app.Constants
import com.example.quiz_app.R
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        startQuestions()
    }

    private fun startQuestions(){
        val questionsList = Constants.getQuestion()
        Log.i("Questions size: ", "${questionsList.size}")

        val currentPosition = 1
        val question: Questions? = questionsList[currentPosition - 1]

        progress_bar.progress = currentPosition
        tv_progress.text = "$currentPosition" + "/" + progress_bar.max

        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.opOne
        tv_option_two.text = question.opTwo
        tv_option_three.text = question.opThree
        tv_option_four.text = question.opFour


    }
}