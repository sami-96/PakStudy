package com.example.pakstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.pakstudy.models.QuestionAnswer;
import com.example.pakstudy.recyclerAdapters.QuestionAnswerRecyclerViewAdapter;

import java.util.ArrayList;

public class QuestionsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private QuestionAnswerRecyclerViewAdapter qrecyclerViewAdapter;
    private ArrayList<QuestionAnswer> questionAnswers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String subName = intent.getStringExtra("RSub");
        setTitle(subName);
        setContentView(R.layout.activity_questions);
        recyclerView = findViewById(R.id.qRecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        questionAnswers = new ArrayList<>();
//        ArrayList<String> ques = new ArrayList<>();
//        QuestionAnswer qObject;
//
//        //Adding QuestionsActivity
//        ques.add("What is Computer?");
//
//        for(String singleQue: ques){
//            qObject = new QuestionAnswer(singleQue);
//            questionAnswers.add(qObject);
//        }
        QuestionAnswer q = new QuestionAnswer();
        q.setQuestion("What is Java?");
        q.setAnswerA("Device");
        q.setAnswerB("Software");
        q.setAnswerC("Hardware");
        q.setAnswerD("Programming Language");
        q.setAnswerR("Programming Language");

        questionAnswers.add(q);

        QuestionAnswer q2 = new QuestionAnswer();
        q2.setQuestion("What is C++?");
        q2.setAnswerA("Software");
        q2.setAnswerB("High level language");
        q2.setAnswerC("None");
        q2.setAnswerD("Both");
        q2.setAnswerR("Programming Language");

        questionAnswers.add(q2);



        qrecyclerViewAdapter = new QuestionAnswerRecyclerViewAdapter(QuestionsActivity.this, questionAnswers);
        recyclerView.setAdapter(qrecyclerViewAdapter);

    }
}