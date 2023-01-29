package com.bolan.service.impl;

import com.bolan.mapper.ArticleMapper;
import com.bolan.pojo.vo.ArticleQuery;
import com.bolan.pojo.vo.ArticleRes;
import com.bolan.pojo.vo.HotArticle;
import com.bolan.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<ArticleRes> list(ArticleQuery articleQuery) {
        return articleMapper.list(articleQuery);
    }

    @Override
    public Long count(ArticleQuery articleQuery) {
        return articleMapper.count(articleQuery);
    }

    @Override
    public void setTop(Integer id, Integer isTop) {
        articleMapper.setTop(id, isTop);
    }

    @Override
    public void setHot(Integer id, Integer isHot) {
        articleMapper.setHot(id, isHot);
    }

    @Override
    public List<HotArticle> hotList() {
        return articleMapper.hotList();
    }

    @Override
    public ArticleRes getArticleById(Integer id) {
        return articleMapper.getArticleById(id);
    }

    @Override
    public List<ArticleRes> getList(ArticleQuery articleQuery) {
        return articleMapper.getList(articleQuery);
    }

    @Override
    public void add(ArticleRes articleRes) {
        articleMapper.add(articleRes);
    }

    @Override
    public Integer getArticleId(String title) {
        return articleMapper.getArticleId(title);
    }

    @Override
    public void setCategoryId(Integer id, Integer categoryId) {
        articleMapper.setCategoryId(id, categoryId);
    }
}
