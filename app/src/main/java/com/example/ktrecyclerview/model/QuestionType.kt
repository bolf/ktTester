package com.example.ktrecyclerview.model

enum class QuestionType {
    SINGLE, MULTI, INPUT;

    fun getQuestionHintByType(questionType: QuestionType): String {
        return when (questionType) {
            SINGLE -> {
                "Выберите один правильный ответ"
            }
            MULTI -> {
                "Выберите один или более правильных ответов"
            }
            INPUT -> {
                "Введите правильный ответ"
            }
        }
    }
}
