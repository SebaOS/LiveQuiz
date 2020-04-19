package com.oskiewicz.androidtest.interfaces;

import com.oskiewicz.androidtest.models.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface BuffAPI {

    @Headers("Content-Type: application/json")
    @GET("buffs/1")
    Call<Result> getData();
}
