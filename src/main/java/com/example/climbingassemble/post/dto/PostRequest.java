package com.example.climbingassemble.post.dto;


import com.example.climbingassemble.post.entity.Post;
import com.example.climbingassemble.user.entity.User;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PostRequest {


    private Long post_id;
    private String title;
    private String content;
    private String nickname;
    private Long view;
    private String created_date;
    private String modified_date;
    private User user;

    public Post toEntity(){
        return Post.builder()
                .post_id(post_id)
                .title(title)
                .content(content)
                .user(User.builder().nickname(nickname).build())
                .view(view)
                .created_date(created_date)
                .modified_date(modified_date)
                .build();

    }

}
