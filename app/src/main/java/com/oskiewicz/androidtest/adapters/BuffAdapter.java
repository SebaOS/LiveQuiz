package com.oskiewicz.androidtest.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.oskiewicz.androidtest.R;
import com.oskiewicz.androidtest.models.Answer;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BuffAdapter extends RecyclerView.Adapter<BuffAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Answer> answerArrayList;
    private String answerImageUrl;


    public BuffAdapter(Context context, ArrayList<Answer> answerArrayList) {
        this.context = context;
        this.answerArrayList = answerArrayList;
    }

    @NonNull
    @Override
    public BuffAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.answer_item, parent, false);
        return new BuffAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BuffAdapter.ViewHolder holder, int position) {
        holder.answerText.setText(answerArrayList.get(position).getTitle());
        answerImageUrl = answerArrayList.get(position).getImage().get0().getUrl();
        Picasso.get().load(answerImageUrl).into(holder.answerImage);
    }

    @Override
    public int getItemCount() {
        return answerArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private AppCompatImageView answerImage;
        private TextView answerText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            answerText = itemView.findViewById(R.id.answerText);
            answerImage = itemView.findViewById(R.id.genericImage);
        }
    }
}
