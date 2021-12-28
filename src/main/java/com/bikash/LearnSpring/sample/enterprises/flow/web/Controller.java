package com.bikash.LearnSpring.sample.enterprises.flow.web;

import com.bikash.LearnSpring.sample.enterprises.flow.bussiness.BusinessServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Sending response in right format
@RestController
public class Controller {
    @Autowired
    private BusinessServices businessServices;
    @GetMapping("/number")
    public int displayNumber(){
        return businessServices.calculate();
    }
}

