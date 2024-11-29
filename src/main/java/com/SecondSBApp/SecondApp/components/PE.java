package com.SecondSBApp.SecondApp.components;

import org.springframework.stereotype.Component;

@Component()
public class PE implements Engine{
    public PE() {
        System.out.println("pe cons");
    }

    @Override
    public int start() {
        System.out.println("Petrol Engine");
        return 1;
    }
}
