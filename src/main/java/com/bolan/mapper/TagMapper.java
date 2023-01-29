package com.bolan.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.Date;

@Mapper
@Repository
public interface TagMapper {

    Integer getTagId(String tagName);

    void add(String tagName, Date createTime);
}
