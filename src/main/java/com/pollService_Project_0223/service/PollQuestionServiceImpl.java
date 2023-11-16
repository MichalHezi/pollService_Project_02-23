package com.pollService_Project_0223.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pollService_Project_0223.model.PollQuestion;
import com.pollService_Project_0223.repository.PollQuestionRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PollQuestionServiceImpl implements PollQuestionService {

    @Autowired
    PollQuestionRepositoryImpl pollQuestionRepository;
    @Autowired
    ObjectMapper objectMapper;

    @Override
    public Integer createQuestion(PollQuestion pollQuestion) {
        return null;
    }

    @Override
    public String updateQuestion(int id, String title) {
        return null;
    }

    @Override
    public String deleteQuestionById(int id) {
        return null;
    }

    @Override
    public PollQuestion getQuestionById(Integer id) {
        return null;
    }

    @Override
    public List<PollQuestion> getAllQuestions() {
        return null;
    }
}
