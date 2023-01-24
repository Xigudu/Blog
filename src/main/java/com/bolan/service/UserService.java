package com.bolan.service;

import com.bolan.pojo.userAuth;

public interface UserService {
    userAuth getUser(String username, String password);
}
