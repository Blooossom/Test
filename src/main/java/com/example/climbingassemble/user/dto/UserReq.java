package com.example.climbingassemble.user.dto;

import com.example.climbingassemble.user.entity.User;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserReq {

    private String userid;

    private String password;

    private String nickname;

    private String email;

    private String address;

    public User toEntity() {
        return User.builder()
                .userid(userid)
                .password(password)
                .nickname(nickname)
                .email(email)
                .address(address)
                .build();
    }

}
