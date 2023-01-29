package com.bolan.service.impl;

import com.bolan.mapper.ArticleTagMapper;
import com.bolan.mapper.TagMapper;
import com.bolan.service.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class TagServiceImpl implements TagService {
    @Resource
    private TagMapper tagMapper;
    @Override
    public Integer getTagId(String tagName) {
        return tagMapper.getTagId(tagName);
    }

    @Override
    public void add(String tagName, Date createTime) {
        tagMapper.add(tagName, createTime);
    }
}
