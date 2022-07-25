package com.maveric.dreams.demo.entity;

import com.maveric.dreams.demo.entity.Enum.role;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class User {


    public  final int  CHECKVALIDATION = 20;
    private String name;
    private String email;
    private String password;

    private LocalDateTime regDate;

    public User(String name, String email, String password){
        this.name = name;
        this.email = setEmail(email);
        this.password = password;

    }

    public String setEmail(String email){
        if(CHECKVALIDATION > email.length()){
            System.out.println("check pass");
        }
        else {
            return "pass fail";
        }
        return "";
    }



}
