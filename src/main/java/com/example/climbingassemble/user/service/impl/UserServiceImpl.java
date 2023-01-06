package com.example.climbingassemble.user.service.impl;

import com.example.climbingassemble.user.dto.UserReq;
import com.example.climbingassemble.user.entity.User;
import com.example.climbingassemble.user.repository.UserRepository;
import com.example.climbingassemble.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

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

    @Override
    @Transactional(readOnly = true)
    public Map<String, String> validateHandling(Errors errors){
        Map<String, String> validatorResult = new HashMap<>();

        for (FieldError error : errors.getFieldErrors()) {
            String validKeyName = String.format("valid_%s", error.getField());
            validatorResult.put(validKeyName, error.getDefaultMessage());
        }
        return validatorResult;
    }

    @Override
    @Transactional(readOnly = true)
    public void checkUserIdDuplication(UserReq req) {
        boolean userIdDuplication = repo.existsByUserid(req.toEntity().getUserid());
        if (userIdDuplication) {
            throw new IllegalStateException("이미 존재하는 아이디입니다.");
        }
    }

    @Override
    @Transactional(readOnly = true)
    public void checkNickNameDuplication(UserReq req) {
        boolean nicknameDuplication = repo.existsByNickname(req.toEntity().getNickname());
        if (nicknameDuplication) {
            throw new IllegalStateException("이미 존재하는 닉네임입니다.");
        }
    }

    @Override
    @Transactional(readOnly = true)
    public void checkEmailDuplication(UserReq req) {
        boolean emailDuplication = repo.existsByEmail(req.toEntity().getEmail());
        if (emailDuplication) {
            throw new IllegalStateException("이미 존재하는 이메일입니다.");
        }
    }
}
