package com.example.climbingassemble.user.service.impl;

import com.example.climbingassemble.user.dto.UserReq;
import com.example.climbingassemble.user.entity.User;
import com.example.climbingassemble.user.repository.UserRepository;
import com.example.climbingassemble.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repo;


    @Override
    public String signUp(UserReq req) {
        try {
            repo.save(req.toEntity());
        } catch (Exception err) {
            err.printStackTrace();
            return "failed";
        }
        return "success";
    }

    @Override
    public String login(UserReq req) {
        User user = repo.findByUseridAndPassword(req.getUserid(), req.getPassword())
                .orElse(null);
        if (user != null) {
            return "success";
        }
        else {
            return "failed";
        }
    }
}
