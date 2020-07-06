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
            "Entregando uma meia", "Expulsando-os de sua casa", "Por um feitiço", "Mandando-os para o Beco-Diagonal",
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
            "Por sua coragem e lealdade", "Por ser ambibiciosa, calculista e orgulhosa", "Por grande capacidade intelectual", "Por ser gentil, paciente e tolerante",
            1)

        questionsList.add(q8)

        val q9 = Questions(9, "Quem é esse personagem?",
            R.drawable.ic_dobby,
            "Fred", "Dobby", "Aquele que não pode ser nomeado", "Troll",
            2)

        questionsList.add(q9)

        val q10 = Questions(10, "Qual o nome do feitiço que faz as coisas levitarem?",
            R.drawable.ic_leviosa,
            "Alohamora", "Expelliarmus", "Wingardium Leviosa", "Accio",
            3)

        questionsList.add(q10)

        val q11 = Questions(11, "A casa Sonserina é conhecida por...",
            R.drawable.ic_sonserina,
            "Por sua coragem e lealdade", "Por grande capacidade intelectual", "Por ser ambibiciosa, calculista e orgulhosa","Por ser gentil, paciente e tolerante",
            3)

        questionsList.add(q11)

        val q12 = Questions(12, "Qual o nome do feitiço da morte?",
            R.drawable.ic_lord,
            "Accio", "Avada Kedavra", "Estupefaço", "Expectro Patronum",
            2)

        questionsList.add(q12)

        val q13 = Questions(13, "A casa Cornival é conhecida por...",
            R.drawable.ic_cornival,
            "Por sua coragem e lealdade", "Por ser ambibiciosa, calculista e orgulhosa", "Por grande capacidade intelectual", "Por ser gentil, paciente e tolerante",
            3)

        questionsList.add(q13)

        val q14 = Questions(14, "Os trouxas são...",
            R.drawable.ic_hogwarts,
            "Pessoas normais", "Bruxos com déficit de atenção", "Professores", "Bruxos com poderes especiais",
            1)

        questionsList.add(q14)


        val q15 = Questions(15, "Quem matou Sirius Black?",
            R.drawable.ic_sirius,
            "Albus Dumbledore", "Aquele que não deve ser nomeado", "Bellatrix Lestrange", "Dolores Umbridge",
            3)

        questionsList.add(q15)

        val q16 = Questions(16, "Qual feitiço é utilizado para acender uma luz na ponta da varinha?",
            R.drawable.ic_lumos,
            "Lucerna", "Lux", "Iluminati", "Lumos",
            4)

        questionsList.add(q16)

        val q17 = Questions(17, "Em qual casa, os três foram parar?",
            R.drawable.ic_trio,
            "Lufa-Lufa", "Grifinória", "Sonserina", "Cornival",
            2)

        questionsList.add(q17)

        val q18 = Questions(18, "A casa Lufa-Lufa é conhecida por...",
            R.drawable.ic_lufalufa,
            "Por sua coragem e lealdade.", "Por ser ambibiciosa, calculista e orgulhosa", "Por grande capacidade intelectual", "Por ser gentil, paciente e tolerante.",
            4)

        questionsList.add(q18)

        val q19 = Questions(19, "Quem o Rony chama quando está hospitalizado",
            R.drawable.ic_rony,
            "Minerva McGonagall", "Harry Potter", "Gina Weasley", "Hermione Granger",
            4)

        questionsList.add(q19)


        val q20 = Questions(20, "Qual feitiço Hermione usa para que os pais esqueçam dela?",
            R.drawable.ic_hermione,
            "Accio", "Obliviate", "Expelliarmus", "Alohamora",
            2)

        questionsList.add(q20)


        return questionsList
    }
}