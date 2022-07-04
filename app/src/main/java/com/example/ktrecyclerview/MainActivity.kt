package com.example.ktrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.ktrecyclerview.impl.QuestionServiceImpl
import com.example.ktrecyclerview.model.Question
import com.example.ktrecyclerview.model.interfaces.QuestionService

class MainActivity : AppCompatActivity() {
    private lateinit var buttonFinish: Button
    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Тренажер знаний"
        setContentView(R.layout.activity_main)
        buttonFinish = findViewById(R.id.buttonFinish)
        buttonFinish.visibility = View.GONE

        val t = QuestionServiceImpl().getQuestions()
        t.forEach(System.out::println)
    }
}