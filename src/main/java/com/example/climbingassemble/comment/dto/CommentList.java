package com.example.climbingassemble.comment.dto;
import java.util.List;

import com.example.climbingassemble.util.Pagination;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommentList {

    private List<CommentResponse> list;
    private Pagination pagination;

}
