package com.example.quiz_app.features.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.quiz_app.R
import com.example.quiz_app.features.quiz_questions.QuizQuestionsActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        startQuiz()
    }


    private fun startQuiz(){
        btn_start.setOnClickListener{
            if(edit_name.text.toString().isEmpty()){
                Toast.makeText(this, "Por favor, digite seu nome.", Toast.LENGTH_LONG).show()
            }else{
                name = edit_name.text.toString()
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra("name", name)
                startActivity(intent)
                finish()
            }
        }
    }
}