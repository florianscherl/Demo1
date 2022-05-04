package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private int count = 0;

    @RequestMapping("/count")
    public String count(){
        count++;
        return "Count neu: " + count;
    }

    @RequestMapping("/reset")
    public String count(){
        count = 0;
        return "Count ist zurückgesetzt";
    }




}
