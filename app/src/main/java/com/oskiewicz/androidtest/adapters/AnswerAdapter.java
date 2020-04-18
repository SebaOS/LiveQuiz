package com.oskiewicz.androidtest.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.oskiewicz.androidtest.R;


public class AnswerAdapter extends RecyclerView.Adapter<AnswerAdapter.AnswerViewHolder>{


    @NonNull
    @Override
    public AnswerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AnswerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class AnswerViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private TextView answer;

        public AnswerViewHolder(@NonNull View itemView) {
            super(itemView);
            this.cardView = itemView.findViewById(R.id.answerCard);
            this.answer = itemView.findViewById(R.id.answerText);
        }
    }
}
