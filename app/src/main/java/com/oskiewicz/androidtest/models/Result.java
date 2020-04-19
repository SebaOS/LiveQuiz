package com.oskiewicz.androidtest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("client_id")
    @Expose
    private Integer clientId;
    @SerializedName("stream_id")
    @Expose
    private Integer streamId;
    @SerializedName("time_to_show")
    @Expose
    private Integer timeToShow;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("question")
    @Expose
    private Question question;
    @SerializedName("answers")
    @Expose
    private List<Answer> answers = null;
    @SerializedName("language")
    @Expose
    private String language;

    public Integer getId() {
        return id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public Integer getTimeToShow() {
        return timeToShow;
    }

    public Integer getPriority() {
        return priority;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Author getAuthor() {
        return author;
    }

    public Question getQuestion() {
        return question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public String getLanguage() {
        return language;
    }
}
