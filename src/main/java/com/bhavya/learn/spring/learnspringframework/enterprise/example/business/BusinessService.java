package com.bhavya.learn.spring.learnspringframework.enterprise.example.business;

import com.bhavya.learn.spring.learnspringframework.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class BusinessService{

    @Autowired
    private DataService dataservice;
    public long calculateSum() {
        List<Integer> data = dataservice.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}