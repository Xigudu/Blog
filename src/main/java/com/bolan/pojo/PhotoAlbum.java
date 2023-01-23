package com.bolan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhotoAlbum {

    private Integer id;

    private String albumName;

    private String albumDesc;

    private String albumCover;

    private Integer status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}