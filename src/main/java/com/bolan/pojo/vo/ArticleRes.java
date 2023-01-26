package com.bolan.pojo.vo;

import com.bolan.pojo.Tag;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleRes {

    private Integer id;

    private Integer userId;

    private String articleCover;

    private String articleTitle;

    private String articleContent;

    private String categoryName;

    private List<Tag> tags;

    private Integer type;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String originalUrl;

    private Integer isTop;

    private String nickname;

}
