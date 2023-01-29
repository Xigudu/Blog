package com.bolan.service.impl;

import com.bolan.mapper.ArticleTagMapper;
import com.bolan.pojo.vo.CategoryRes;
import com.bolan.pojo.vo.TagRes;
import com.bolan.service.ArticleTagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleTagServiceImpl implements ArticleTagService {

    @Resource
    private ArticleTagMapper articleTagMapper;

    @Override
    public List<TagRes> tagList() {
        return articleTagMapper.tagList();
    }

    @Override
    public List<CategoryRes> categoryList() {
        return articleTagMapper.categoryList();
    }

    @Override
    public void add(Integer articleId, Integer tagId) {
        articleTagMapper.add(articleId,tagId);
    }

}
