package com.example.climbingassemble.comment.service.impl;

import com.example.climbingassemble.comment.dto.CommentRequest;
import com.example.climbingassemble.comment.dto.CommentResponse;
import com.example.climbingassemble.comment.entity.Comment;
import com.example.climbingassemble.comment.repository.CommentRepository;
import com.example.climbingassemble.comment.service.CommentService;
import com.example.climbingassemble.post.dto.PostRequest;
import com.example.climbingassemble.post.entity.Post;
import com.example.climbingassemble.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository repo;

    @Override
    public List<CommentResponse> viewCommentList(PostRequest request) {
       return repo.findByPostPost_id(String.valueOf(request.getPost_id()));
    }

    @Override
    public String addComment(CommentRequest commentRequest) {
        try {
            repo.save(Comment.builder()
                    .post(Post.builder().post_id(Long.valueOf(commentRequest.getPost_id())).build())
                    .user(User.builder().nickname(commentRequest.getNickname()).build())
                    .text(commentRequest.getText())
                    .created_date(commentRequest.getCreated_date())
                    .modified_date(commentRequest.getModified_date())
                    .build());
        }catch (Exception err) {
            err.printStackTrace();
            return "failed";
        }
        return "success";
    }

    @Override
    public String deleteComment(Long comment_id) {
        try{
            repo.deleteById(comment_id);
        }catch (Exception err) {
            err.printStackTrace();
            return "failed";
        }
        return "success";
    }

    @Override
    public String modifyComment(Long comment_id) {
        return null;
    }

}
