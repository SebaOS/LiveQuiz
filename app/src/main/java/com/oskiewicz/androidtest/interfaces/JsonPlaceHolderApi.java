package com.oskiewicz.androidtest.interfaces;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {

    @GET("buffs/{id}")
    Call<List<Result>> getResults(@Path("id") int postId);
}
