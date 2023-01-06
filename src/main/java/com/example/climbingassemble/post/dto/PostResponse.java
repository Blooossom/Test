package com.example.climbingassemble.post.dto;


import com.example.climbingassemble.post.entity.Post;
import com.example.climbingassemble.user.entity.User;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostResponse {

    private String post_id;
    private String title;
    private String content;
    private String nickname;
    private Long view;
    private String created_date;
    private String modified_date;
    private User user;

    public PostResponse (Post post) {
        this.post_id = String.valueOf(post.getPost_id());
        this.title = post.getTitle();
        this.content = post.getContent();
        this.nickname = post.getUser().getNickname();
        this.view = post.getView();
        this.created_date = post.getCreated_date();
        this.modified_date = post.getModified_date();
    }


}
