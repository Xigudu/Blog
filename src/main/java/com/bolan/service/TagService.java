package com.bolan.service;

import java.util.Date;

public interface TagService {

    Integer getTagId(String tagName);

    void add(String tagName, Date createTime);
}
