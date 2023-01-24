package com.bolan.pojo.vo;

import com.bolan.pojo.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleRes {

    private Integer id;

    private String articleCover;

    private String articleTitle;

    private String categoryName;

    private Tag tag;

    private Integer type;

    private LocalDateTime createTime;

    private Integer isTop;

}
