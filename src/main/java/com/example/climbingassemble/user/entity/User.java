package com.example.climbingassemble.user.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userid;

    @Column
    private String password;

    @Column
    private String nickname;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private String indate;




}
