package com.bolan.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendBlog {

    private Long id;
    private String title;
    private String firstPicture;
    private boolean recommend;

}
