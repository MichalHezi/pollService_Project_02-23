package com.pollService_Project_0223.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pollService_Project_0223.model.UserAnswer;
import com.pollService_Project_0223.repository.UserAnswerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserAnswerServiceImpl implements UserAnswerService {

    @Autowired
    private UserAnswerRepositoryImpl userAnswerRepository;
    @Autowired
    private ObjectMapper objectMapper;
    @Override
    public String saveAnswers(UserAnswer userAnswer) {
        return null;
    }

    @Override
    public String updateAnswer(int id, String questionTitle) {
        return null;
    }

    @Override
    public String deleteAnswerById(int id) {
        return null;
    }

    @Override
    public UserAnswer getUserAnswersById(Integer id) {
        return null;
    }

    @Override
    public List<UserAnswer> getAllUserAnswers() {
        return null;
    }
}
