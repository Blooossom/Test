package com.example.climbingassemble.post.service;

import com.example.climbingassemble.post.dto.PostResponse;

import java.util.List;

public interface PostService {

    List<PostResponse> selectPostList();

    List<PostResponse> selectPostByNickName(String nickname);
}
