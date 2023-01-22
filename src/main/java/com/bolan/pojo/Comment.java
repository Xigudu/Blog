package com.bolan.pojo;

import com.bolan.pojo.vo.DetailedBlog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private Long id;
    private String email;
    private String content;
    private String nickname;

    private String avatar;
    private Date createTime;

    private Long blogId;
    //父评论id 用来标识子评论属于哪个父评论的
    private Long parentCommentId;
    private String parentNickname;
    //回复评论
    private List<Comment> replyComments = new ArrayList<>();
    private Comment parentComment;//做扩展用，展示没有什么用，评论内容都存在了content字段中
    private boolean adminComment;

    private DetailedBlog blog;

}
