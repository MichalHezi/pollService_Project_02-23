package com.pollService_Project_0223.repository;

import com.pollService_Project_0223.model.PollQuestion;
import com.pollService_Project_0223.repository.mapper.PollQuestionMapper;
import com.pollService_Project_0223.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PollQuestionRepositoryImpl implements PollQuestionRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer createQuestion(PollQuestion pollQuestion) {
        String sql = "INSERT INTO " + Constants.QUESTIONS_TABLE_NAME + "(question_title,first_answer_option,second_answer_option,third_answer_option,fourth_answer_option) VALUES (?,?,?,?,?)";
        return jdbcTemplate.update(sql,pollQuestion.getQuestionTitle(),pollQuestion.getFirstAnswerOption(),pollQuestion.getSecondAnswerOption(),pollQuestion.getThirdAnswerOption(),pollQuestion.getFourthAnswerOption());
    }

    @Override
    public String updateQuestion(int id, String title) {
        String sql = "UPDATE " + Constants.QUESTIONS_TABLE_NAME + " SET question_title = ? WHERE id = ?";
        jdbcTemplate.update(sql,id,title);
        return ("The question has been updated");
    }

    @Override
    public String deleteQuestionById(int id) {
        String sql = "DELETE FROM " + Constants.QUESTIONS_TABLE_NAME + " WHERE id = ?";
        jdbcTemplate.update(sql,id);
        return ("The question has been deleted");
    }

    @Override
    public PollQuestion getQuestionById(Integer id) {
        String sql = "SELECT * FROM " + Constants.QUESTIONS_TABLE_NAME + " WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new PollQuestionMapper(),id);
    }

    @Override
    public List<PollQuestion> getAllQuestions() {
        String sql = "SELECT * FROM " + Constants.QUESTIONS_TABLE_NAME;
        return jdbcTemplate.query(sql,new PollQuestionMapper());
    }
}
