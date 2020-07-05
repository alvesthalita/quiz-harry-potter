package com.example.quiz_app

import com.example.quiz_app.features.quiz_questions.Questions

object Constants {

    fun getQuestion(): ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val q1 = Questions(1, "Quem é este personagem?",
            R.drawable.ic_harry,
            "Rony Weasley", "Draco Malfoy", "Harry Potter", "Tom Riddle",
            3)

        questionsList.add(q1)

        val q2 = Questions(2, "Quantos filmes do Harry Potter foram lançados?",
            R.drawable.ic_hogwarts,
            "4", "8", "5", "7",
            2)

        questionsList.add(q2)

        val q3 = Questions(3, "Quais são os melhores amigos do Harry Potter",
            R.drawable.ic_harry2,
            "Draco e Bellatriz", "Voldemort e Lucio", "Rony e Hermione", "Edwiges e Dobby",
            3)

        questionsList.add(q3)

        val q4 = Questions(4, "Como que é dada a liberdade aos elfos domésticos?",
            R.drawable.ic_elfos,
            "Entregando uma meia", "Expulsando-os de sua casa", "Por um feitiço", "Mandando para o Beco-Diagonal",
            1)

        questionsList.add(q4)

        val q5 = Questions(5, "Qual o nome da escola de Bruxos?",
            R.drawable.ic_hogwarts,
            "Expelliarmus", "Hogwarts", "Accio", "Tribruxos",
            2)

        questionsList.add(q5)

        val q6 = Questions(6, "Quem conseguiu pegar o Pomo de Ouro?",
            R.drawable.ic_pomo,
            "Rony Weasley", "Draco Malfoy", "Albus Dumbledore", "Harry Potter",
            4)

        questionsList.add(q6)

        val q7 = Questions(7, "Quem é essa personagem?",
            R.drawable.ic_murta,
            "Hermione Granger", "Bellatrix Lestrange", "Nagini", "Murta Que Geme",
            4)

        questionsList.add(q7)

        val q8 = Questions(8, "A casa Griffinória é conhecida por...",
            R.drawable.ic_gryffindor,
            "Por sua coragem e lealdade.", "Por ser ambibiciosa, calculista e orgulhosa", "Por grande capacidade intelectual", "Por ser gentil, paciente e tolerante.",
            1)

        questionsList.add(q8)

        val q9 = Questions(9, "A casa Sonserina é conhecida por...",
            R.drawable.ic_sonserina,
            "Por sua coragem e lealdade.", "Por grande capacidade intelectual", "Por ser ambibiciosa, calculista e orgulhosa","Por ser gentil, paciente e tolerante.",
            3)

        questionsList.add(q9)

        val q10 = Questions(10, "A casa Cornival é conhecida por...",
            R.drawable.ic_gryffindor,
            "Por sua coragem e lealdade.", "Por ser ambibiciosa, calculista e orgulhosa", "Por grande capacidade intelectual", "Por ser gentil, paciente e tolerante.",
            3)

        questionsList.add(q10)

        val q11 = Questions(11, "A casa Lufa-Lufa é conhecida por...",
            R.drawable.ic_gryffindor,
            "Por sua coragem e lealdade.", "Por ser ambibiciosa, calculista e orgulhosa", "Por grande capacidade intelectual", "Por ser gentil, paciente e tolerante.",
            4)

        questionsList.add(q11)


        return questionsList
    }
}