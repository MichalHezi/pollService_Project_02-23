package com.pollService_Project_0223.repository.mapper;

import com.pollService_Project_0223.model.Choice;
import com.pollService_Project_0223.model.UserAnswer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAnswerMapper implements RowMapper<UserAnswer> {
    @Override
    public UserAnswer mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new UserAnswer(
                rs.getInt("id"),
                rs.getInt("question_id"),
                Choice.valueOf(rs.getString("answer_option")),
                rs.getInt("user_id")
        );
    }
}
