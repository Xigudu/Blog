package com.bolan.mapper;

import com.bolan.pojo.ArticleTag;
import com.bolan.pojo.Tag;
import com.bolan.pojo.vo.CategoryRes;
import com.bolan.pojo.vo.TagRes;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleTagMapper {

    List<TagRes> tagList();

    List<CategoryRes> categoryList();

    void add(Integer articleId,Integer tagId);

}
