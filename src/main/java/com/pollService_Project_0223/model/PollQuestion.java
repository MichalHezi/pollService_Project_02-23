package com.pollService_Project_0223.model;




public class PollQuestion {

    private Integer id;
    private String questionTitle;
    private Choice A;
    private Choice B;
    private Choice C;
    private Choice D;


    public PollQuestion(Integer id, String questionTitle, Choice firstAnswerOption, Choice secondAnswerOption, Choice thirdAnswerOption, Choice fourthAnswerOption) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.A = firstAnswerOption;
        this.B = secondAnswerOption;
        this.C = thirdAnswerOption;
        this.D = fourthAnswerOption;
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

    public Choice getA() {
        return A;
    }

    public void setA(Choice a) {
        this.A = a;
    }

    public Choice getB() {
        return B;
    }

    public void setB(Choice b) {
        this.B = b;
    }

    public Choice getC() {
        return C;
    }

    public void setC(Choice c) {
        this.C = c;
    }

    public Choice getD() {
        return D;
    }

    public void setD(Choice d) {
        this.D = d;
    }
}
