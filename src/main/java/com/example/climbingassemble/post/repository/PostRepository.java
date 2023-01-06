package com.example.climbingassemble.post.repository;

import com.example.climbingassemble.post.dto.PostResponse;
import com.example.climbingassemble.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {


    List<PostResponse> findByUserNickname(String nickname);

}
