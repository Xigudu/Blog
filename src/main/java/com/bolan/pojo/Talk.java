package com.bolan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Talk {

    private Integer id;

    private Integer userId;

    private String content;

    private String images;

    private Integer isTop;

    private Integer status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
