package com.pollService_Project_0223.repository;

import com.pollService_Project_0223.model.PollQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PollQuestionRepositoryImpl implements PollQuestionRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

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
