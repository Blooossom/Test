package com.example.climbingassemble.comment.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommentRequest {

    private String nickname;
    private String created_date;
    private String modified_date;
    private String text;




}
