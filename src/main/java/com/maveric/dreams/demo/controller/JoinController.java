package com.maveric.dreams.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoinController {

    @GetMapping("/")
    public String test(){
        return "test";
    }


}

