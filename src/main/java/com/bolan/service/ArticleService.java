package com.bolan.service;

import com.bolan.pojo.Article;
import com.bolan.pojo.vo.ArticleQuery;
import com.bolan.pojo.vo.ArticleRes;

import java.util.List;

public interface ArticleService {

    List<ArticleRes> list(ArticleQuery articleQuery);

    Long count(ArticleQuery articleQuery);
}
