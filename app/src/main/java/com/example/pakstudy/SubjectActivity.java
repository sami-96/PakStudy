package com.example.pakstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pakstudy.models.Subject;
import com.example.pakstudy.recyclerAdapters.SubjectRecyclerViewAdapter;

import java.util.ArrayList;

public class SubjectActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SubjectRecyclerViewAdapter subjectRecyclerViewAdapter;
    private ArrayList<Subject> subjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        recyclerView = findViewById(R.id.rView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        subjects = new ArrayList<>();
        ArrayList<String> subs = new ArrayList<>();
        Subject subObject;

        //Subjects to Add in recyler View
        subs.add("Computer");
        subs.add("General Knowledge");
        subs.add("Current Affairs");
        subs.add("World Current Affairs");
        subs.add("Pak Study");
        subs.add("Everyday Science");
        subs.add("English");
        subs.add("Islamic Studies");
        subs.add("Physics");
        subs.add("Chemistry");
        subs.add("Maths");
        subs.add("Urdu");
        subs.add("Sindhi");
        subs.add("Urdu");
        subs.add("Pedagogy");

        for(String singleSub: subs){
            subObject = new Subject(singleSub);
            subjects.add(subObject);
        }

        subjectRecyclerViewAdapter = new SubjectRecyclerViewAdapter(SubjectActivity.this,subjects);
        recyclerView.setAdapter(subjectRecyclerViewAdapter);
    }
}