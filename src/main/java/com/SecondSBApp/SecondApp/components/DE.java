package com.SecondSBApp.SecondApp.components;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component()
public class DE implements Engine{


    DE(){
        System.out.println("DE constuctor");
    }

    @PostConstruct
    public void dieselEngine(){
        System.out.println("Post - Constructor");
    }


    @PreDestroy
    public void destroy(){
        System.out.println("Destroyed");
    }

    @Override
    public int start() {
        System.out.println("Diesel Engine");
        return 1;
    }
}
