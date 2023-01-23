package com.bolan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag {

    private Integer id;

    private String tagName;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
