package com.example.climbingassemble.post.dto;

import com.example.climbingassemble.util.Pagination;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostList {

    private List<PostResponse> list;
    private Pagination pagination;

}
