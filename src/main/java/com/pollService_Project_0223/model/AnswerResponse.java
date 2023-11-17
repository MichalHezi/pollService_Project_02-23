package com.pollService_Project_0223.model;

import java.util.List;

public class AnswerResponse {

    private PollQuestion pollQuestion;
    private List<UserAnswer> userAnswers;

    public AnswerResponse(PollQuestion pollQuestion, List<UserAnswer> userAnswers) {
        this.pollQuestion = pollQuestion;
        this.userAnswers = userAnswers;
    }

    public PollQuestion getPollQuestion() {
        return pollQuestion;
    }

    public void setPollQuestion(PollQuestion pollQuestion) {
        this.pollQuestion = pollQuestion;
    }

    public List<UserAnswer> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<UserAnswer> userAnswers) {
        this.userAnswers = userAnswers;
    }
}
