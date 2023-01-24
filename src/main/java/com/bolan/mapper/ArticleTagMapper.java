package com.bolan.mapper;

import com.bolan.pojo.ArticleTag;
import com.bolan.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleTagMapper {

    List<Tag> list();
}
