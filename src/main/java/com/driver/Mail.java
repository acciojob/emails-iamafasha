package com.driver;

import java.util.Date;

public class Mail {
    public Date date;
    public String message;
    public String sender;

    Mail(Date date, String message, String sender){
        this.date = date;
        this.sender = sender;
        this.message = message;
    }
}