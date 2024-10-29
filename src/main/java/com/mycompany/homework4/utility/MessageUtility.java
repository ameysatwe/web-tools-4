package com.mycompany.homework4.utility;

import org.springframework.stereotype.Component;

@Component
public class MessageUtility {

    public String getMessage(){
        return "Hello World! From utility";
    }
}
