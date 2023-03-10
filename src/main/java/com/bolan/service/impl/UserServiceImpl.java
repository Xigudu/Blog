package com.bolan.service.impl;

import com.bolan.mapper.UserMapper;
import com.bolan.pojo.userAuth;
import com.bolan.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public userAuth getUser(String username, String password) {
        return userMapper.getUser(username, password);
    }
}
