package com.bolan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class About {

    private Integer id;

    private String content;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
