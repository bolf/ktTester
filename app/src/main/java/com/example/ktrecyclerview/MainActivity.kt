package com.example.ktrecyclerview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.RecyclerView
import com.example.ktrecyclerview.impl.JsonQuestionServiceImpl
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    private lateinit var buttonFinish: Button
    private lateinit var recyclerView : RecyclerView
    val getTestFile = registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri: Uri? ->
        println(uri)
        if (uri != null) {
            try {
                val iS = contentResolver.openInputStream(uri)
                JsonQuestionServiceImpl().getQuestions(InputStreamReader(iS))
                println(iS)
            } catch (ec : Exception) {
                println(ec)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Тренажер знаний"
        setContentView(R.layout.activity_main)
        buttonFinish = findViewById(R.id.buttonFinish)
        buttonFinish.visibility = View.GONE

        val t = JsonQuestionServiceImpl().getQuestions()
        t.forEach(System.out::println)
    }

    fun pickTestFileBtnClickListener(view: View) {
        getTestFile.launch(arrayOf("application/json"))
    }

    fun finishTestBtnClickListener(view: View) {}

}