package com.pollService_Project_0223.repository;

import com.pollService_Project_0223.model.UserAnswer;

public interface UserAnswerRepository {

    void createAnswer(UserAnswer userAnswer);
    void deleteAnswer(int id);
    void updateAnswerById(int id);

}
