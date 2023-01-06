package com.example.climbingassemble.page.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class PageController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/signUp")
    public String signup(){
        return "signup";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/post")
    public String goPost(){
        return "postlist";
    }

    @GetMapping("/post/write")
    public String writePost(){
        return "writepost";
    }

    @GetMapping("/post/modify/{post_id}")
    public String modifyPost(){
        return "modifypost";
    }
}
