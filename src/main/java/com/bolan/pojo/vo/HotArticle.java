package com.bolan.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotArticle {

    private Integer id;

    private String articleCover;

    private String articleTitle;

    private String articleContent;

    private Integer isHot;

    private LocalDateTime createTime;

}
