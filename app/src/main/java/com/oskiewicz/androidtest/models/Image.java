package com.oskiewicz.androidtest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("0")
    @Expose
    private com.oskiewicz.androidtest.models._0 _0;
    @SerializedName("1")
    @Expose
    private com.oskiewicz.androidtest.models._1 _1;
    @SerializedName("2")
    @Expose
    private com.oskiewicz.androidtest.models._2 _2;

    public com.oskiewicz.androidtest.models._0 get0() {
        return _0;
    }

    public com.oskiewicz.androidtest.models._1 get1() {
        return _1;
    }

    public com.oskiewicz.androidtest.models._2 get2() {
        return _2;
    }

}