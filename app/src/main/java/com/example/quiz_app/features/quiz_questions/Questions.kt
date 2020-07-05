package com.example.quiz_app.features.quiz_questions

data class Questions (val id: Int, val question: String, val image: Int, val opOne: String, val opTwo: String, val opThree: String, val opFour: String, val correctAnswer: Int)