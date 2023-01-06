package com.example.climbingassemble.user.controller;


import com.example.climbingassemble.user.dto.UserReq;
import com.example.climbingassemble.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Map;

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

    //회원가입
    @PostMapping("/signup")
    public String signUp(@Valid UserReq req, Errors errors, Model model){
        try {
            service.checkUserIdDuplication(req);
            service.checkNickNameDuplication(req);
            service.checkEmailDuplication(req);
        } catch (Exception err) {
            err.printStackTrace();
            return "signup";
        }
        if (errors.hasErrors()) {

            model.addAttribute("req", req);

            Map<String, String> validatorResult = service.validateHandling(errors);
            for (String key : validatorResult.keySet()) {
                model.addAttribute(key, validatorResult.get(key));
            }
            return "signup";
        }
        service.signUp(req);
        return "login";
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
