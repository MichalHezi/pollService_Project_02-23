package com.pollService_Project_0223.controller;

import com.pollService_Project_0223.model.PollQuestion;
import com.pollService_Project_0223.service.PollQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class PollQuestionController {

    @Autowired
    private PollQuestionService pollQuestionService;

    @PostMapping
    public Integer createQuestion(@RequestBody PollQuestion pollQuestion){
        return null;
    }

    @DeleteMapping
    public String deleteQuestionById(@RequestParam int id){
        return pollQuestionService.deleteQuestionById(id);
    }

    @PutMapping(value = "/update/question")
    public String updateQuestion(@RequestBody PollQuestion pollQuestion) {
        if (pollQuestion.getId() == 1 || pollQuestion.getQuestionTitle() == null || pollQuestion.getA() == null || pollQuestion.getB() == null || pollQuestion.getC() == null || pollQuestion.getD() == null) {
            return "Can't change stuff to null";
        }else{
            return pollQuestionService.updateQuestion(pollQuestion.getId(), pollQuestion.getQuestionTitle());
        }
    }

    @GetMapping
    public PollQuestion getQuestionById(@RequestParam int id){
        return pollQuestionService.getQuestionById(id);
    }

    @GetMapping(value = "/all-questions")
    public List<PollQuestion> getAllQuestions(){
        return pollQuestionService.getAllQuestions();
    }

}
