package com.pollService_Project_0223.model;




public class PollQuestion {

    private Integer id;
    private String questionTitle;
    private String firstAnswerOption;
    private String secondAnswerOption;
    private String thirdAnswerOption;
    private String fourthAnswerOption;

    public PollQuestion(Integer id, String questionTitle, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.firstAnswerOption = firstAnswer;
        this.secondAnswerOption = secondAnswer;
        this.thirdAnswerOption = thirdAnswer;
        this.fourthAnswerOption = fourthAnswer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getFirstAnswerOption() {
        return firstAnswerOption;
    }

    public void setFirstAnswerOption(String firstAnswerOption) {
        this.firstAnswerOption = firstAnswerOption;
    }

    public String getSecondAnswerOption() {
        return secondAnswerOption;
    }

    public void setSecondAnswerOption(String secondAnswerOption) {
        this.secondAnswerOption = secondAnswerOption;
    }

    public String getThirdAnswerOption() {
        return thirdAnswerOption;
    }

    public void setThirdAnswerOption(String thirdAnswerOption) {
        this.thirdAnswerOption = thirdAnswerOption;
    }

    public String getFourthAnswerOption() {
        return fourthAnswerOption;
    }

    public void setFourthAnswerOption(String fourthAnswerOption) {
        this.fourthAnswerOption = fourthAnswerOption;
    }
}
