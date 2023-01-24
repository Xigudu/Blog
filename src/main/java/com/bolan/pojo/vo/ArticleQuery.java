package com.bolan.pojo.vo;


import com.bolan.utils.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleQuery extends Page {

    private Integer type;

    private Integer categoryId;

    private Integer id;

    private String articleTitle;

}
