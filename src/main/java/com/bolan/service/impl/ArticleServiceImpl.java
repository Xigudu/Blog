package com.bolan.service.impl;

import com.bolan.mapper.ArticleMapper;
import com.bolan.pojo.Article;
import com.bolan.pojo.vo.ArticleQuery;
import com.bolan.pojo.vo.ArticleRes;
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
}
