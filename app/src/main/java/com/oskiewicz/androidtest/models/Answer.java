package com.oskiewicz.androidtest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Answer {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("buff_id")
    @Expose
    private Integer buffId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("image")
    @Expose
    private Image image;

    public Integer getId() {
        return id;
    }

    public Integer getBuffId() {
        return buffId;
    }

    public String getTitle() {
        return title;
    }

    public Image getImage() {
        return image;
    }

}
