package com.bolan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {

    private Integer id;

    private Integer userId;

    private Integer categoryId;

    private String articleCover;

    private String articleTitle;

    private String articleContent;

    private Integer isTop;

    private Integer status;

    private Integer type;

    private String originalUrl;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
