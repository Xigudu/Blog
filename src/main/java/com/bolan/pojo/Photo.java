package com.bolan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photo {

    private Integer id;

    private Integer albumId;

    private String photoName;

    private String photoDesc;

    private String photoSrc;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}