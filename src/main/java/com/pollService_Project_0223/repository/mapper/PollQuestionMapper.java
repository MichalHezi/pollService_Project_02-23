package com.pollService_Project_0223.repository.mapper;

import com.pollService_Project_0223.model.Choice;
import com.pollService_Project_0223.model.PollQuestion;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PollQuestionMapper implements RowMapper<PollQuestion> {

    @Override
    public PollQuestion mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new PollQuestion(
               rs.getInt("id"),
               rs.getString("question_title"),
               Choice.valueOf(rs.getString("A")),
               Choice.valueOf(rs.getString("B")),
               Choice.valueOf(rs.getString("C")),
               Choice.valueOf(rs.getString("D"))


        );
    }
}
