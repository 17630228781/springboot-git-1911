package com.jk.springbootgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/hi")
    public String hi(){
        return "had记得吗,好啊有";
    }

}
