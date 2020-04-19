package com.oskiewicz.androidtest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class _2 {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("url")
    @Expose
    private String url;

    public String getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getUrl() {
        return url;
    }

}
