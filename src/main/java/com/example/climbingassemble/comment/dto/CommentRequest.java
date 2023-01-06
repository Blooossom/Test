package com.example.climbingassemble.comment.dto;


import com.example.climbingassemble.comment.entity.Comment;
import com.example.climbingassemble.post.entity.Post;
import com.example.climbingassemble.user.entity.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommentRequest {
    private String post_id;
    private String nickname;
    private String created_date;
    private String modified_date;
    private String text;

    public Comment toEntity(CommentRequest request){
        return Comment.builder()
                .post(Post.builder().post_id(Long.valueOf(post_id)).build())
                .user(User.builder().nickname(nickname).build())
                .text(text)
                .created_date(created_date)
                .modified_date(modified_date)
                .build();
    }


}
