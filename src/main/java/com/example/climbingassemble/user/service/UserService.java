package com.example.climbingassemble.user.service;

import com.example.climbingassemble.user.dto.UserReq;
import org.springframework.validation.Errors;

import java.util.Map;

public interface UserService {


    Map<String, String> validateHandling(Errors errors);
    void checkUserIdDuplication(UserReq req);
    void checkNickNameDuplication(UserReq req);
    void checkEmailDuplication(UserReq req);

    String signUp(UserReq req);

    String login(UserReq req);
}
