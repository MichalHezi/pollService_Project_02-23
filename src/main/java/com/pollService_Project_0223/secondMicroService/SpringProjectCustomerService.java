package com.pollService_Project_0223.secondMicroService;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "springProjectCustomerService",
        url = "$(user_service.url)"
)
public interface SpringProjectCustomerService {

    @GetMapping(value = "/all-answers-by-id")
    String getAllAnswersUserById(int id);

    @GetMapping(value = "/how-many-users")
    int getHowManyUsersAnsweredByQuestionId(int id);
    @GetMapping(value = "/how-many-question")
    int getHowManyQuestionAnsweredByUser(int id);
    @GetMapping(value = "/all-questions-answered")
    int getHowManyAnsweredToEachQuestionById(int id);




}
