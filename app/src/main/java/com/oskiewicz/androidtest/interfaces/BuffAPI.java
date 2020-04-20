package com.oskiewicz.androidtest.interfaces;

import com.oskiewicz.androidtest.models.Buff;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface BuffAPI {

    @Headers("Content-Type: application/json")
    @GET("buffs/{id}")
    Call<Buff> getData(@Path("id") Integer postId);
}
