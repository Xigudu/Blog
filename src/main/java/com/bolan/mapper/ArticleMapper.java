package com.bolan.mapper;

import com.bolan.pojo.vo.ArticleQuery;
import com.bolan.pojo.vo.ArticleRes;
import com.bolan.pojo.vo.DateRes;
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

    List<HotArticle> hotList();

    ArticleRes getArticleById(Integer id);

    List<ArticleRes> getList(ArticleQuery articleQuery);
}
