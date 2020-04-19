package com.oskiewicz.androidtest.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.oskiewicz.androidtest.R;
import com.oskiewicz.androidtest.models.Answer;

import java.util.ArrayList;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ResultViewHolder> {
    private Context context;
    private ArrayList<Answer> answersList;

    public ResultAdapter(Context context, ArrayList<Answer> answers) {
        this.context = context;
        this.answersList = answers;
    }

    @NonNull
    @Override
    public ResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.answer_item, parent, false);
        return new ResultViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResultViewHolder holder, int position) {
        Answer currentItem = answersList.get(position);

        String answerContent = currentItem.getTitle();

        holder.answerText.setText(answerContent);
    }

    @Override
    public int getItemCount() {
        return answersList.size();
    }

    public class ResultViewHolder extends RecyclerView.ViewHolder {
        public ImageView genericImage;
        public TextView answerText;

         public ResultViewHolder(@NonNull View itemView) {
            super(itemView);
            genericImage = itemView.findViewById(R.id.genericImage);
            answerText = itemView.findViewById(R.id.answerText);
        }
    }
}
