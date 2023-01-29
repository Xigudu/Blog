package com.bolan.service;


import com.bolan.pojo.vo.CategoryRes;
import com.bolan.pojo.vo.TagRes;

import java.util.List;

public interface ArticleTagService {

    List<TagRes> tagList();

    void add(Integer articleId, Integer tagId);

    List<CategoryRes> categoryList();
}
