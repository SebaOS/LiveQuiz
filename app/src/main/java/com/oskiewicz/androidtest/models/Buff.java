package com.oskiewicz.androidtest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Buff {

    @SerializedName("result")
    @Expose
    private Result result;

    public Result getResult() {
        return result;
    }

}