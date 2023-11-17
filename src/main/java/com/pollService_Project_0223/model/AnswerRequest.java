package com.pollService_Project_0223.model;

public class AnswerRequest {

    private PollQuestion pollQuestion;
    private UserAnswer userAnswer;

    public AnswerRequest(PollQuestion pollQuestion, UserAnswer userAnswer) {
        this.pollQuestion = pollQuestion;
        this.userAnswer = userAnswer;
    }

    public PollQuestion getPollQuestion() {
        return pollQuestion;
    }

    public void setPollQuestion(PollQuestion pollQuestion) {
        this.pollQuestion = pollQuestion;
    }

    public UserAnswer getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(UserAnswer userAnswer) {
        this.userAnswer = userAnswer;
    }
}
