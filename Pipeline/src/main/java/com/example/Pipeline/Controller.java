package com.example.Pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    
    @GetMapping("/cicd")
    public String display(){
        return "Learning CICD PipeLine";


    }
}
