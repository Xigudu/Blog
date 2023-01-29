package com.bolan.service.impl;

import com.bolan.mapper.CategoryMapper;
import com.bolan.pojo.Category;
import com.bolan.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public Integer getCategoryId(String categoryName) {
        return categoryMapper.getId(categoryName);
    }

    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }

    @Override
    public void add(String categoryName, Date createTime) {
        categoryMapper.add(categoryName, createTime);
    }
}
