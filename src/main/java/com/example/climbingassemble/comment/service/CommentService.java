package com.example.climbingassemble.comment.service;

import com.example.climbingassemble.comment.dto.CommentRequest;
import com.example.climbingassemble.comment.dto.CommentResponse;
import com.example.climbingassemble.post.dto.PostRequest;
import com.example.climbingassemble.post.entity.Post;

import java.util.List;

public interface CommentService {

    List<CommentResponse> viewCommentList(PostRequest request);

    String addComment(CommentRequest commentRequest);

    String deleteComment(Long comment_id);

    String modifyComment(Long comment_id);


}
