package com.bikash.LearnSpring.sample.enterprises.flow.bussiness;

import com.bikash.LearnSpring.sample.enterprises.flow.Data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//Business Logic
@Component
public
class BusinessServices {
    @Autowired
    DataService dataService;

    public int calculate() {
        List<Integer> data = dataService.retrieveData();
        return data.stream().reduce(Integer::sum).get();
    }
}
