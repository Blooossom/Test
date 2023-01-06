package com.example.climbingassemble.comment.repository;

import com.example.climbingassemble.comment.dto.CommentResponse;
import com.example.climbingassemble.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {


    List<CommentResponse> findByPostPost_id(String post_id);




}
