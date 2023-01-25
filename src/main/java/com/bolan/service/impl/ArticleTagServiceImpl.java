package com.bolan.service.impl;

import com.bolan.mapper.ArticleTagMapper;
import com.bolan.pojo.Tag;
import com.bolan.service.ArticleTagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleTagServiceImpl implements ArticleTagService {

    @Resource
    private ArticleTagMapper articleTagMapper;

    @Override
    public List<Tag> list() {
        return articleTagMapper.list();
    }

}
