package com.bolan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FriendLink {

    private Integer id;

    private String linkName;

    private String linkAvatar;

    private String linkAddress;

    private String linkIntro;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
