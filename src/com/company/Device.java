package com.company;

public class Device {
    Ticket getTicket(Internet internet){
        if(internet.connect()){
            return internet.getTicket();
        }

        return null;
    }
}
