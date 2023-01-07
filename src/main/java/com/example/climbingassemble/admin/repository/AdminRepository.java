package com.example.climbingassemble.admin.repository;

import com.example.climbingassemble.admin.entity.Admin;
import com.example.climbingassemble.user.dto.UserResponse;
import com.example.climbingassemble.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {


    Optional<Admin> findByAdminidAndAdminpassword(String id, String password);

    UserResponse findUserByUserId(String userid);

    String deleteUserByUserId(String id);
}
