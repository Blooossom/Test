package com.example.climbingassemble.post.controller;


import com.example.climbingassemble.post.dto.PostRequest;
import com.example.climbingassemble.post.dto.PostResponse;
import com.example.climbingassemble.post.entity.Post;
import com.example.climbingassemble.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService service;

    //게시글 전체 조회
    @GetMapping("/post")
    public List<PostResponse> viewPostList(){
       return service.selectPostList();
    }

    //작성자 검색
    @GetMapping("/post/search?keyword={nickname}")
    public List<PostResponse> viewPostListByNickName(@PathVariable String nickname) {
        return service.selectPostByNickName(nickname);
    }

    //게시글 등록
    @PostMapping("/post")
    public String writePost(Post post) {
        return null;
    }

    //게시글 삭제
    @DeleteMapping("/post")
    public String deletePost(Post post){
        return null;
    }

    //게시글 수정
    @PutMapping("/post")
    public String modifiedPost(Post post){
        return null;
    }

    //게시글 조회
    @GetMapping("/post/{id}")
    public PostResponse viewPost(PostRequest request){
        return null;
    }
}
