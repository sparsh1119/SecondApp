package com.SecondSBApp.SecondApp.service;

import com.SecondSBApp.SecondApp.components.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class App {

    @Autowired
    @Qualifier("PE")
    Engine engine ;

    public  void  drive(){
        int res = engine.start();
        if(res>0){
            
            System.out.println("Engine Started !!");
        }else{
            System.out.println("Not Started !!");
        }
    }
}
