package com.example.climbingassemble.post.service.impl;

import com.example.climbingassemble.post.dto.PostResponse;
import com.example.climbingassemble.post.entity.Post;
import com.example.climbingassemble.post.repository.PostRepository;
import com.example.climbingassemble.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository repo;

    @Override
    public List<PostResponse> selectPostList() {
        List<PostResponse> responseList = repo.findAll().stream()
                .map(en -> new PostResponse(en)).collect(Collectors.toList());
        return responseList;
    }

    @Override
    public List<PostResponse> selectPostByNickName(String nickname) {
        return repo.findByUserNickname(nickname);
    }


}
