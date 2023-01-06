package com.example.climbingassemble.comment.controller;

import com.example.climbingassemble.comment.dto.CommentRequest;
import com.example.climbingassemble.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentRepository repo;


    @GetMapping("/comment")
    public String selectComment(){
        return null;
    }

    @PostMapping("/comment")
    public String addComment(CommentRequest request) {
        return null;
    }

    @PutMapping("/comment")
    public String modifyComment(String commentId, CommentRequest request){
        return null;
    }

    @DeleteMapping("/comment")
    public String deleteComment(String commentId){
        return null;
    }







}
