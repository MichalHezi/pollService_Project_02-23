package com.pollService_Project_0223.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pollService_Project_0223.model.AnswerRequest;
import com.pollService_Project_0223.model.AnswerResponse;
import com.pollService_Project_0223.model.PollQuestion;
import com.pollService_Project_0223.model.UserAnswer;
import com.pollService_Project_0223.repository.UserAnswerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAnswerServiceImpl implements UserAnswerService {

    @Autowired
    private UserAnswerRepositoryImpl userAnswerRepository;
    @Autowired
    private ObjectMapper objectMapper;
    @Override
    public AnswerResponse saveAnswers(AnswerRequest answerRequest) {
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
