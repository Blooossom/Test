package com.example.climbingassemble.user.service;

import com.example.climbingassemble.user.dto.UserRequest;
import org.springframework.validation.Errors;

import java.util.Map;

public interface UserService {


    Map<String, String> validateHandling(Errors errors);
    void checkUserIdDuplication(UserRequest req);
    void checkNickNameDuplication(UserRequest req);
    void checkEmailDuplication(UserRequest req);

    String signUp(UserRequest req);

    String login(UserRequest req);
}
