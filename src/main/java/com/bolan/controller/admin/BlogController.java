package com.bolan.controller.admin;

import com.bolan.pojo.vo.ArticleQuery;
import com.bolan.pojo.vo.ArticleRes;
import com.bolan.pojo.vo.MdRes;
import com.bolan.pojo.vo.Result;
import com.bolan.service.ArticleService;
import com.bolan.service.ArticleTagService;
import com.bolan.service.CategoryService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;


@Controller
@RequestMapping("/admin")
public class BlogController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ArticleTagService articleTagService;

    @ResponseBody
    @RequestMapping("/articles")
    public Result<Object> listArticle(ArticleQuery articleQuery, Model model){
        List<ArticleRes> list = articleService.list(articleQuery);
        System.out.println(list);
        Long count = articleService.count(articleQuery);
        return Result.success(list,count);
    }

    //修改是否推荐
    @ResponseBody
    @RequestMapping("/top")
    public Result<Object> updateTop(Integer id,Integer isTop){
        articleService.setTop(id,isTop);
        if (isTop == 1)
            return Result.success("成功置顶！");
        return Result.success("取消置顶！");
    }

    //上传图片
    @ResponseBody
    @RequestMapping("/upload")
    public MdRes fileUpload(@RequestParam(value = "file")MultipartFile file){
        //上传路径保存设置

        //获得SpringBoot当前项目的路径：System.getProperty("user.dir")
        String path = "D:/blog/upload/";

        File realPath = new File(path);
        if (!realPath.exists()){
            realPath.mkdirs();
        }

        //上传文件地址
        System.out.println("上传文件保存地址："+realPath);

        //解决文件名字问题：我们使用uuid;
        String filename = "pg-"+ UUID.randomUUID().toString().replaceAll("-", "")+".jpg";
        File newfile = new File(realPath, filename);
        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        try {
            file.transferTo(newfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //给editormd进行回调
        String url = "http://localhost:9958/upload/"+ filename;
        String[] values = {url};
        MdRes mdRes = new MdRes();
        mdRes.setError(0);
        mdRes.setUrl(values);
        System.out.println(mdRes);
        return mdRes;
    }

}
