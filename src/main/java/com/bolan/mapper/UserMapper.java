package com.bolan.mapper;

import com.bolan.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    User getUser(String username, String password);
}
