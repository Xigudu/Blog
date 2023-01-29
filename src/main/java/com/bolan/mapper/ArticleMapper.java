package com.bolan.mapper;

import com.bolan.pojo.vo.ArticleQuery;
import com.bolan.pojo.vo.ArticleRes;
import com.bolan.pojo.vo.HotArticle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleMapper {

    List<ArticleRes> list(ArticleQuery articleQuery);

    Long count(ArticleQuery articleQuery);

    void setTop(Integer id, Integer isTop);

    void setHot(Integer id, Integer isHot);

    void setCategoryId(Integer id, Integer categoryId);

    List<HotArticle> hotList();

    ArticleRes getArticleById(Integer id);

    List<ArticleRes> getList(ArticleQuery articleQuery);

    void add(ArticleRes articleRes);

    Integer getArticleId(String title);


}
