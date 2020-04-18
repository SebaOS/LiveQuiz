package com.oskiewicz.androidtest.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public void setStreamId(Integer streamId) {
        this.streamId = streamId;
    }

    public Integer getTimeToShow() {
        return timeToShow;
    }

    public void setTimeToShow(Integer timeToShow) {
        this.timeToShow = timeToShow;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}