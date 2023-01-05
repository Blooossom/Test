package com.example.climbingassemble.comment.entity;


import com.example.climbingassemble.post.entity.Post;
import com.example.climbingassemble.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {

    @Id
    private Long id;

    @Column
    private String text;

    @Column
    private String created_date;

    @Column
    private String modified_date;

    @ManyToOne
    @JoinColumn(name = "nickname")
    private User user;

    @ManyToOne
    @JoinColumn(name = "title")
    private Post post;




}
