package com.example.climbingassemble.user.repository;

import com.example.climbingassemble.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUseridAndPassword(String userId, String password);
}
