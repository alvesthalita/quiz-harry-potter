package com.example.quiz_app.features.quiz_questions

import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.quiz_app.Constants
import com.example.quiz_app.R
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var currentPosition: Int = 1
    private var questionsList: ArrayList<Questions>? = null
    private var selectedOptionPosition: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_send_answer.setOnClickListener(this)
    }

    private fun setQuestion(){
        questionsList = Constants.getQuestion()
        val question = questionsList!!.get(currentPosition - 1)
        defaultOptionsView()

        if(currentPosition == questionsList!!.size){
            btn_send_answer.text = "Fim"
        }else{
            btn_send_answer.text = "Enviar"
        }


        progress_bar.progress = currentPosition
        tv_progress.text = "$currentPosition" + "/" + progress_bar.max

        tv_question.text = question.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.opOne
        tv_option_two.text = question.opTwo
        tv_option_three.text = question.opThree
        tv_option_four.text = question.opFour

    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for(option in options){
            option.setTextColor(ContextCompat.getColor(this, R.color.textColor))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.background_option_border)
        }
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                tv_option_one.background = ContextCompat.getDrawable(this, drawableView)
            }

            2->{
                tv_option_two.background = ContextCompat.getDrawable(this, drawableView)
            }

            3->{
                tv_option_three.background = ContextCompat.getDrawable(this, drawableView)
            }

            4->{
                tv_option_four.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }


    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one -> {
                selectedOptionPosition(tv_option_one, 1)
            }

            R.id.tv_option_two -> {
                selectedOptionPosition(tv_option_two, 2)
            }

            R.id.tv_option_three -> {
                selectedOptionPosition(tv_option_three, 3)
            }

            R.id.tv_option_four -> {
                selectedOptionPosition(tv_option_four, 4)
            }

            R.id.btn_send_answer -> {
                if(selectedOptionPosition == 0){
                    currentPosition++

                    when{
                        currentPosition <= questionsList!!.size -> {
                            setQuestion()
                        }else-> {
                            Toast.makeText(this, "Parabéns, você completou o quiz!!!", Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    val question = questionsList?.get(currentPosition - 1)

                    if(question!!.correctAnswer != selectedOptionPosition){
                        answerView(selectedOptionPosition, R.drawable.wrong_option_border)
                    }

                    answerView(question.correctAnswer, R.drawable.correct_option_border)

                    if(currentPosition == questionsList!!.size){
                        btn_send_answer.text = "Fim"
                    }else{
                        btn_send_answer.text = "Ir para a próxima pergunta"
                    }

                    selectedOptionPosition = 0
                }
            }
        }
    }

    private fun selectedOptionPosition(tv: TextView, selectedOpNum: Int){
        defaultOptionsView()
        selectedOptionPosition = selectedOpNum

        tv.setTextColor(ContextCompat.getColor(this, R.color.darkGreyTextColor))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border)
    }

}