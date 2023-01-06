package com.example.climbingassemble.admin.service;

import com.example.climbingassemble.admin.dto.AdminReq;
import com.example.climbingassemble.post.entity.Post;
import com.example.climbingassemble.user.dto.UserResponse;

import java.util.List;

public interface AdminService {

    String adminLogin(AdminReq adminReq);

    List<UserResponse> viewUserList();

    List<Post> viewPostList();

    List<Post> viewPostFindByUserId(String userId);

    String banUser(String userId);

    String deletePost(String title);

}
