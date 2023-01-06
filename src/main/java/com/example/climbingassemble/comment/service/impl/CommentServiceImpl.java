package com.example.climbingassemble.comment.service.impl;

import com.example.climbingassemble.comment.repository.CommentRepository;
import com.example.climbingassemble.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentRepository repo;

}
