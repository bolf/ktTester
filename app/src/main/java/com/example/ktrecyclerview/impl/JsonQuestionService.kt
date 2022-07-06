package com.example.ktrecyclerview.impl

import com.example.ktrecyclerview.model.AnswerType
import com.example.ktrecyclerview.model.Question
import com.example.ktrecyclerview.model.QuestionType
import com.example.ktrecyclerview.model.interfaces.QuestionService
import com.github.javafaker.Faker
import java.io.InputStreamReader
import java.util.*

class JsonQuestionServiceImpl: QuestionService {
    private var questionList: List<Question>

    init {
        val faker = Faker.instance()
        questionList = (1..100).map {
            Question(id = UUID.randomUUID().toString(),
                question = faker.programmingLanguage().toString(),
                answers = mutableListOf("a","b","c"),
                rightAnswersInd = mutableListOf(2),
                QuestionType.INPUT,
                answerType = AnswerType.STRING
            )
        }
    }

    override fun getQuestions(): List<Question> {
        return questionList
    }

    override fun getQuestions(inputStreamReader: InputStreamReader) : List<Question> {
        return questionList
    }

    override fun removeQuestion(question: Question) {
//        val ind = questionList.indexOfFirst { q -> question.id == q.id  }
//        if (ind > -1) {
//            questionList.removeAt(ind)
//        }
    }
}