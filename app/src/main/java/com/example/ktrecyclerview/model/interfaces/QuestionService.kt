package com.example.ktrecyclerview.model.interfaces

import com.example.ktrecyclerview.model.Question
import java.io.InputStreamReader

interface QuestionService {
    fun getQuestions() : List<Question>
    fun removeQuestion(question: Question)
    fun getQuestions(inputStreamReader: InputStreamReader): List<Question>
}