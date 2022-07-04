package com.example.ktrecyclerview.model.interfaces

import com.example.ktrecyclerview.model.Question

interface QuestionService {
    fun getQuestions() : List<Question>
    fun removeQuestion(question: Question)
}