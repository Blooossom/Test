package com.example.climbingassemble.admin.service.impl;

import com.example.climbingassemble.admin.dto.AdminReq;
import com.example.climbingassemble.admin.entity.Admin;
import com.example.climbingassemble.admin.repository.AdminRepository;
import com.example.climbingassemble.admin.service.AdminService;
import com.example.climbingassemble.post.dto.PostResponse;
import com.example.climbingassemble.post.entity.Post;
import com.example.climbingassemble.user.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository repo;


    @Override
    public String adminLogin(AdminReq adminReq) {
        Admin admin =
            repo.findByAdminidAndAdminpassword(adminReq.getAdminId(), adminReq.getAdminPassword())
                    .orElse(null);
        if (admin != null) {
            return "success";
        }
        else {
            return "failed";
        }
    }

    @Override
    public List<UserResponse> viewUserList() {
        return null;
    }

    @Override
    public List<PostResponse> viewPostList() {
        return null;
    }

    @Override
    public List<Post> viewPostFindByUserId(String userId) {
        return null;
    }

    @Override
    public String banUser(String userId) {
        try {
            repo.deleteUserByUserId(userId);
        } catch (Exception err) {
            err.printStackTrace();
            return "failed";
        }
        return "success";
    }

    @Override
    public String deletePost(@PathVariable String title) {
        try{
            repo.deleteById(title);
        }catch (Exception err){
            err.printStackTrace();
            return "failed";
        }
        return "success";
    }


    //수정 필요할 듯
    @Override
    public UserResponse findUserByUserid(String userid) {
        return repo.findUserByUserId(userid);
    }
}
