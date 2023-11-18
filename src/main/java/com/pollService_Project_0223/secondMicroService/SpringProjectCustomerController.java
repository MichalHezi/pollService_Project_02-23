package com.pollService_Project_0223.secondMicroService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SpringProjectCustomerController {

    @GetMapping(value = "/getAllAnswers")
    String getAllAnswersUserByIde(){
        return null;
    }
}
