package com.example.myquizapp

object Constants {

    // palavras chaves nas quais estamos armazenando os detalhes para que possamos recuperá-los
    // quando estivermos movendo dados de uma atividade para outra
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Belgium", "Brazil", "Armenia", "Australia",
            4
        )

        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina", "Belgium", "Armenia", "Austria",
            2
        )

        questionsList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Australia", "Brazil", "Austria",
            3
        )

        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark", "Dominica", "Ethiopia", "Egypt",
            1
        )

        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France", "Fiji", "Finland",
            3
        )

        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Greece", "Georgia", "Germany", "none of these",
            3
        )

        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "India", "Iran", "Hungary",
            2
        )

        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "India", "Belgium", "Fiji", "Kuwait",
            4
        )

        questionsList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Jordan", "New Zealand", "Palestine", "Sudan",
            2
        )

        questionsList.add(que10)

        return questionsList

    }
}