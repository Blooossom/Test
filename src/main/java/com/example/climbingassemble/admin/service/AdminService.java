package com.example.climbingassemble.admin.service;

import com.example.climbingassemble.admin.dto.AdminReq;
import com.example.climbingassemble.post.entity.Post;
import com.example.climbingassemble.user.dto.UserReq;
import com.example.climbingassemble.user.dto.UserRes;
import com.example.climbingassemble.user.entity.User;

import java.util.List;

public interface AdminService {

    String adminLogin(AdminReq adminReq);

    List<UserRes> viewUserList();

    List<Post> viewPostList();

    List<Post> viewPostFindByUserId(String userId);

    String banUser(String userId);

    String deletePost(String title);

}
