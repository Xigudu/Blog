package com.bolan.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileUtils {

    public static String uploadFile(MultipartFile file, String filePath){
        if (file.isEmpty()){
            return "";
        }
        //获取原文件名
        String fileName = file.getOriginalFilename();
        //UUID重组文件名
        String uid = UUID.randomUUID().toString();
        fileName = uid + fileName;
        String resPath = filePath + fileName;
        File newFile = new File(resPath);

        if (newFile.getParentFile() != null && !newFile.getParentFile().exists()){
            System.out.println("创建目录中");
            if (newFile.getParentFile().mkdirs()){
                System.out.println("创建目录成功");
            }else {
                System.out.println("创建目录失败");
                return "";
            }
        }
        try {
            file.transferTo(newFile);
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
        return resPath;
    }
}
