package com.example.ktrecyclerview.model

data class Question constructor(
    val id: String,
    val question: String,
    val answers: List<String>,
    val rightAnswersInd: List<Int>,
    val questionType: QuestionType,
    val answerType: AnswerType
) {
    val userAnswersIndexesList: List<Int> = ArrayList()
    var userAnswer = ""
    var markImage = -1
    var rightAnswer = 0
}