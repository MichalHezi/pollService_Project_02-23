package com.pollService_Project_0223.controller;

import com.pollService_Project_0223.model.AnswerRequest;
import com.pollService_Project_0223.model.AnswerResponse;
import com.pollService_Project_0223.service.UserAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answers")
public class UserAnswerController {

    @Autowired
    private UserAnswerService userAnswerService;

    @PostMapping
    public AnswerResponse saveAnswers(@RequestBody AnswerRequest answerRequest){
        return userAnswerService.saveAnswers(answerRequest);
    }


}
