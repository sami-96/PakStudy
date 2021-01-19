package com.example.pakstudy.recyclerAdapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pakstudy.R;
import com.example.pakstudy.models.QuestionAnswer;
import com.example.pakstudy.QuizActivity;

import java.util.List;

public class QuestionAnswerRecyclerViewAdapter extends RecyclerView.Adapter<QuestionAnswerRecyclerViewAdapter.ViewHolder> {
    private Context context;
    private List<QuestionAnswer> questionAnswers;

    public QuestionAnswerRecyclerViewAdapter(Context context, List<QuestionAnswer> questionAnswers) {
        this.context = context;
        this.questionAnswers = questionAnswers;
    }


    @NonNull
    @Override
    public QuestionAnswerRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_questionrow,parent,false);

        return new QuestionAnswerRecyclerViewAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull QuestionAnswerRecyclerViewAdapter.ViewHolder holder, int position) {
        QuestionAnswer questionAnswer = questionAnswers.get(position);
        holder.questionName.setText(questionAnswer.getQuestion());
//        holder.ans.setText(questionAnswer.getAnswerR());

    }

    @Override
    public int getItemCount() {
        return questionAnswers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView questionName,ans;
        public CardView questionCard;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            questionName = itemView.findViewById(R.id.questionId);
//            ans = itemView.findViewById(R.id.answerId);
//            questionCard = itemView.findViewById(R.id.questionCard);
            questionName.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int pos = this.getAdapterPosition();
            QuestionAnswer questionAnswer = questionAnswers.get(pos);
//
            Intent intent = new Intent(context, QuizActivity.class);
            intent.putExtra("rQuestion", questionAnswer.getQuestion());
            intent.putExtra("rAnswerA", questionAnswer.getAnswerA());
            intent.putExtra("rAnswerB", questionAnswer.getAnswerB());
            intent.putExtra("rAnswerC", questionAnswer.getAnswerC());
            intent.putExtra("rAnswerD", questionAnswer.getAnswerD());
            intent.putExtra("rAnswerR", questionAnswer.getAnswerR());
            context.startActivity(intent);

//            ans.setVisibility(View.VISIBLE);

        }
    }

}

