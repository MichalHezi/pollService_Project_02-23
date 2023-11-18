package com.pollService_Project_0223.service;

import com.pollService_Project_0223.model.AnswerRequest;
import com.pollService_Project_0223.model.AnswerResponse;
import com.pollService_Project_0223.model.UserAnswer;

import java.util.List;

public interface UserAnswerService {

    AnswerResponse saveAnswers(AnswerRequest answerRequest);
    String updateAnswer(int id,String questionTitle);
    String deleteAnswerById(int id);
    UserAnswer getUserAnswersById(Integer id);
    List<UserAnswer> getAllUserAnswers();

}
