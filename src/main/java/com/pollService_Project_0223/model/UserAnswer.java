package com.pollService_Project_0223.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserAnswer {

    private Integer id;
    @JsonProperty("question_id")
    private Integer questionId;
    @JsonProperty("answer_choice")
    private Choice answerChoice;
    @JsonProperty("user_id")
    private Integer userId;

    public UserAnswer(Integer id, Integer questionId, Choice answerChoice, Integer userId) {
        this.id = id;
        this.questionId = questionId;
        this.answerChoice = answerChoice;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Choice getAnswerChoice() {
        return answerChoice;
    }

    public void setAnswerChoice(Choice answerChoice) {
        this.answerChoice = answerChoice;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
