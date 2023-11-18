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





}
