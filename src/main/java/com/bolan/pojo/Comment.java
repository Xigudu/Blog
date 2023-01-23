package com.bolan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private Integer id;

    private Integer userId;

    private Integer topicId;

    private String commentContent;

    private Integer replyUserId;

    private Integer parentId;

    private Integer type;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
