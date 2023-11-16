package com.pollService_Project_0223.repository;

import com.pollService_Project_0223.model.PollQuestion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PollQuestionRepository {
    Integer createQuestion(PollQuestion pollQuestion);
    String updateQuestion(int id, String title);
    String deleteQuestionById(int id);

    PollQuestion getQuestionById(Integer id);
    List<PollQuestion>getAllQuestions();



}
