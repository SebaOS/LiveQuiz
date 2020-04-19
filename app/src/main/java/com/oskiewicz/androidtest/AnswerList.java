package com.oskiewicz.androidtest;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.oskiewicz.androidtest.adapters.ResultAdapter;
import com.oskiewicz.androidtest.interfaces.BuffAPI;
import com.oskiewicz.androidtest.models.Answer;
import com.oskiewicz.androidtest.models.Result;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AnswerList extends AppCompatActivity {

    private static final String BASE_URL = "https://buffup.proxy.beeceptor.com/";
    public static final String TAG = "AnswerList";

    private RecyclerView recyclerView;
    private ResultAdapter resultAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_list);


        recyclerView = findViewById(R.id.listAnswer);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        parseJSON();
    }

    public void parseJSON() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        BuffAPI buffAPI = retrofit.create(BuffAPI.class);
        Call<Result> call = buffAPI.getData();

        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Log.d(TAG, "onResponse: received info: " + response.body().toString());

                List<Answer> answersList = response.body().getAnswers();

            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                Log.d(TAG, "onFailure: Something went wrong: " + t.getMessage());
            }
        });

    }
}
