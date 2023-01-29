package com.bolan.service;

import com.bolan.pojo.vo.ArticleQuery;
import com.bolan.pojo.vo.ArticleRes;
import com.bolan.pojo.vo.HotArticle;

import java.util.List;

public interface ArticleService {

    List<ArticleRes> list(ArticleQuery articleQuery);

    Long count(ArticleQuery articleQuery);

    void setTop(Integer id, Integer isTop);

    void setHot(Integer id, Integer isHot);

    List<HotArticle> hotList();

    ArticleRes getArticleById(Integer id);

    List<ArticleRes> getList(ArticleQuery articleQuery);

    void add(ArticleRes articleRes);

    Integer getArticleId(String title);

    void setCategoryId(Integer id, Integer categoryId);
}
