package com.SecondSBApp.SecondApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/dAt")
public class DateAndTime {

    @GetMapping("/check")
    public String checkDT(){
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        return ""+dateTime;
    }
}
