package com.example.climbingassemble.post.entity;

import com.example.climbingassemble.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Post {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long post_id;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Long view;

    @Column
    private String created_date;

    @Column
    private String modified_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nickname")
    private User user;



}
