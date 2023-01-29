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

    private static Integer USERID = 1;

    private Integer id;

    private Integer userId;

    private String articleCover;

    private String articleTitle;

    private String articleContent;

    private String categoryId;

    private String categoryName;

    private String[] catName;

    private List<TagRes> tags;

    private String[] tagName;

    private Integer type;

    private Date createTime;

    private Date updateTime;

    private String originalUrl;

    private Integer isTop;

    private Integer isHot;

    private String nickname;

}
