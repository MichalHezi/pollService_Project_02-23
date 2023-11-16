package com.pollService_Project_0223.service;

import com.pollService_Project_0223.model.PollQuestion;

import java.util.List;

public interface PollQuestionService {

    Integer createQuestion(PollQuestion pollQuestion);
    String updateQuestion(int id, String title);
    String deleteQuestionById(int id);

    PollQuestion getQuestionById(Integer id);
    List<PollQuestion> getAllQuestions();
}
