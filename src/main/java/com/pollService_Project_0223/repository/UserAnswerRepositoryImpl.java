package com.pollService_Project_0223.repository;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.pollService_Project_0223.model.UserAnswer;
import com.pollService_Project_0223.repository.mapper.UserAnswerMapper;
import com.pollService_Project_0223.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserAnswerRepositoryImpl implements UserAnswerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    ObjectMapper objectMapper;
    @Override
    public void createAnswer(UserAnswer userAnswer) {
        String sql = "INSERT INTO " + Constants.ANSWERS_TABLE_NAME + "(answer_option) VALUES (?)";
        jdbcTemplate.update(sql,userAnswer.getAnswerChoice().name());
    }

    @Override
    public void deleteAnswer(int id) {
        String sql = "DELETE FROM " + Constants.ANSWERS_TABLE_NAME + " WHERE id = ?";
        jdbcTemplate.update(sql,id);

    }

    @Override
    public void updateAnswerById(int id) {
        String sql = "UPDATE " + Constants.ANSWERS_TABLE_NAME + " SET answer_option = ? WHERE id = ?";
        jdbcTemplate.update(sql,id);

    }

    @Override
    public UserAnswer getAnswerById(int id) {
        String sql = "SELECT * FROM " + Constants.ANSWERS_TABLE_NAME + " WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new UserAnswerMapper(),id);
    }
}
