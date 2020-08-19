package com.jk.springbootgit.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

    @RequestMapping("/hello")
    public void hello(){
        System.out.println("5466");
    }

    @RequestMapping("/hi")
    public String hi(){
        return "had记得吗,好啊有";
    }

}
