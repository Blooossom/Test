package com.example.climbingassemble.user.service;

import com.example.climbingassemble.user.dto.UserReq;

public interface UserService {

    String signUp(UserReq req);

    String login(UserReq req);
}
