package com.example.pakstudy.models;

public class QuestionAnswer {
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String answerR;

    public QuestionAnswer(String question) {
        this.question = question;
    }

    public QuestionAnswer(String question, String answerA, String answerB, String answerC, String answerD, String answerR) {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.answerR = answerR;
    }
    public QuestionAnswer() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getAnswerR() {
        return answerR;
    }

    public void setAnswerR(String answerR) {
        this.answerR = answerR;
    }
}
