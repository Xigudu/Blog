package com.bolan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Picture {
    private Long id;
    private String pictureName;
    private String pictureTime;
    private String pictureAddress;
    private String pictureDescription;

}
