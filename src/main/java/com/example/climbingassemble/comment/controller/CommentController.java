package com.example.climbingassemble.comment.controller;

import com.example.climbingassemble.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentRepository repo;
}
