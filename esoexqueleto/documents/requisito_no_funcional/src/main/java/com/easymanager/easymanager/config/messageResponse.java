package com.easymanager.easymanager.config;

public class messageResponse {

    private String message;

    public String getMessage(){return message;}

    public void setMessage(String message){this.message = message;}

    public messageResponse(String message){
        this.message = message;
    }

    public messageResponse(){}
}
