package com.pollService_Project_0223.model;




public class PollQuestion {

    private Integer id;
    private String questionTitle;
    private Choice firstAnswerOption;
    private Choice secondAnswerOption;
    private Choice thirdAnswerOption;
    private Choice fourthAnswerOption;


    public PollQuestion(Integer id, String questionTitle, Choice firstAnswerOption, Choice secondAnswerOption, Choice thirdAnswerOption, Choice fourthAnswerOption) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.firstAnswerOption = firstAnswerOption;
        this.secondAnswerOption = secondAnswerOption;
        this.thirdAnswerOption = thirdAnswerOption;
        this.fourthAnswerOption = fourthAnswerOption;
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

    public Choice getFirstAnswerOption() {
        return firstAnswerOption;
    }

    public void setFirstAnswerOption(Choice firstAnswerOption) {
        this.firstAnswerOption = firstAnswerOption;
    }

    public Choice getSecondAnswerOption() {
        return secondAnswerOption;
    }

    public void setSecondAnswerOption(Choice secondAnswerOption) {
        this.secondAnswerOption = secondAnswerOption;
    }

    public Choice getThirdAnswerOption() {
        return thirdAnswerOption;
    }

    public void setThirdAnswerOption(Choice thirdAnswerOption) {
        this.thirdAnswerOption = thirdAnswerOption;
    }

    public Choice getFourthAnswerOption() {
        return fourthAnswerOption;
    }

    public void setFourthAnswerOption(Choice fourthAnswerOption) {
        this.fourthAnswerOption = fourthAnswerOption;
    }
}
