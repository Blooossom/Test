package com.example.climbingassemble.user.controller;


import com.example.climbingassemble.user.dto.UserReq;
import com.example.climbingassemble.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/login")
    public String login(UserReq req, HttpSession session){
        String result = service.login(req);
        if (result.equals("success")) {
            session.setAttribute("userid", req.getUserid());
        }
        return result;
    }

    @PostMapping("/signup")
    public String signUp(UserReq req){
        return service.signUp(req);
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        if (session.getAttribute("userid") != null) {
            session.setAttribute("userid", null);
            return "login";
        }
        return "index";
    }





}
