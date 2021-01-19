package com.example.pakstudy.recyclerAdapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pakstudy.QuestionsActivity;
import com.example.pakstudy.R;
import com.example.pakstudy.models.Subject;

import java.util.List;

public class SubjectRecyclerViewAdapter extends RecyclerView.Adapter<SubjectRecyclerViewAdapter.ViewHolder> {
    private Context context;
    private List<Subject> subjects;

    public SubjectRecyclerViewAdapter(Context context, List<Subject> subjects) {
        this.context = context;
        this.subjects = subjects;
    }


    @NonNull
    @Override
    public SubjectRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_subjectrow,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectRecyclerViewAdapter.ViewHolder holder, int position) {
        Subject subject = subjects.get(position);
        holder.subjectName.setText(subject.getSubjectName());
    }

    @Override
    public int getItemCount() {
        return subjects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView subjectName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            subjectName = itemView.findViewById(R.id.subName);
            subjectName.setOnClickListener(this);
        }



        @Override
        public void onClick(View v) {
            int pos = this.getAdapterPosition();
            Subject subject = subjects.get(pos);

            Intent intent = new Intent(context, QuestionsActivity.class);
            intent.putExtra("RSub",subject.getSubjectName());
            context.startActivity(intent);

        }
    }

}
