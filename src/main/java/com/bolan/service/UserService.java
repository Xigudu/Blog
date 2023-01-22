package com.bolan.service;

import com.bolan.pojo.User;

public interface UserService {
    User getUser(String username, String password);
}
