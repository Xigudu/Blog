package com.bolan.mapper;

import com.bolan.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface CategoryMapper {

    List<Category> list();

    Integer getId(String categoryName);

    void add(String categoryName, Date createTime);
}
