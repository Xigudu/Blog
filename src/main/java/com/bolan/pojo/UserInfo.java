package com.bolan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private Integer id;
    private String email;
    private String nickname;
    private String avatar;
    private String intro;
    private String website;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
