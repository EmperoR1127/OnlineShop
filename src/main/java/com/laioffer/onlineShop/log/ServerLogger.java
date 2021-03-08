package com.laioffer.onlineShop.log;

import org.springframework.stereotype.Component;

public class ServerLogger implements Logger{
    
    @Override
    public void log(String info) {
        System.out.println("server log = " + info);
    }
}
