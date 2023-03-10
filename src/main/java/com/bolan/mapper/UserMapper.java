package com.bolan.mapper;

import com.bolan.pojo.userAuth;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    userAuth getUser(String username, String password);
}
