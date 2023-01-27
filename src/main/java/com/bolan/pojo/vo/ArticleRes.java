package com.bolan.pojo.vo;

import com.bolan.pojo.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
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

    private Date createTime;

    private Date updateTime;

    private String originalUrl;

    private Integer isTop;

    private String nickname;

}
