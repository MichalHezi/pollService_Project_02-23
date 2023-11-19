package com.pollService_Project_0223.secondMicroService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SpringProjectCustomerController {

    @Autowired
    private SpringProjectCustomerService springProjectCustomerService;

    @GetMapping(value = "/getAllAnswers")
    String getAllAnswersUserByIde(@RequestParam int id){
        return springProjectCustomerService.getAllAnswersUserById(id);
    }
    @GetMapping(value = "/how-many-users")
    int getHowManyUsersAnsweredByQuestionId(@RequestParam int id){
        return springProjectCustomerService.getHowManyUsersAnsweredByQuestionId(id);
    }
    @GetMapping(value = "/how-many-question")
    int getHowManyQuestionAnsweredByUser(@RequestParam int id){
        return springProjectCustomerService.getHowManyQuestionAnsweredByUser(id);
    }
    @GetMapping(value = "/all-questions-answered")
    int getHowManyAnsweredToEachQuestionById(@RequestParam int id){
        return springProjectCustomerService.getHowManyAnsweredToEachQuestionById(id);
    }

}
