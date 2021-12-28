package com.bikash.LearnSpring.sample.enterprises.flow.Data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//Getting Data
@Component
public
class DataService {
    public List<Integer> retrieveData(){
        return Arrays.asList(30,64,56,80);
    }
}