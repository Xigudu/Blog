package com.bolan.service;

import com.bolan.pojo.Category;

import java.util.Date;
import java.util.List;

public interface CategoryService {

    Integer getCategoryId(String categoryName);

    List<Category> list();

    void add(String categoryName, Date createTime);
}
