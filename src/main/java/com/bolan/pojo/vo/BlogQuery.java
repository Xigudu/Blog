package com.bolan.pojo.vo;

import com.bolan.pojo.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogQuery {

    private Long id;
    private String title;
    private String updateTime;
    private Boolean recommend;
    private Boolean published;
    private Long typeId;
    private Type type;

}
