package com.bolan.mapper;

import com.bolan.pojo.Article;
import com.bolan.pojo.vo.ArticleQuery;
import com.bolan.pojo.vo.ArticleRes;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleMapper {

    List<ArticleRes> list(ArticleQuery articleQuery);

    Long count(ArticleQuery articleQuery);
}
