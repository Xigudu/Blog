package com.bolan.controller.admin;

import com.bolan.pojo.Category;
import com.bolan.pojo.Tag;
import com.bolan.pojo.vo.*;
import com.bolan.service.ArticleService;
import com.bolan.service.ArticleTagService;
import com.bolan.service.CategoryService;
import com.bolan.service.TagService;
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
    @Autowired
    private TagService tagService;

    @ResponseBody
    @RequestMapping("/articles")
    public Result<Object> listArticle(ArticleQuery articleQuery, Model model){
        List<ArticleRes> list = articleService.list(articleQuery);
        Long count = articleService.count(articleQuery);
        return Result.success(list,count);
    }

    //修改是否置顶
    @ResponseBody
    @RequestMapping("/top")
    public Result<Object> updateTop(Integer id,Integer isTop){
        articleService.setTop(id,isTop);
        if (isTop == 1)
            return Result.success("成功置顶！");
        return Result.success("取消置顶！");
    }

    //修改是否推荐
    @ResponseBody
    @RequestMapping("/hot")
    public Result<Object> updateHot(Integer id,Integer isHot){
        articleService.setHot(id,isHot);
        if (isHot == 1)
            return Result.success("开启推荐！");
        return Result.success("关闭推荐！");
    }

    //上传图片
    @ResponseBody
    @RequestMapping("/upload")
    public MdRes fileUpload(@RequestParam(value = "editormd-image-file")MultipartFile file){

        String path = "D:/blog/upload/";

        File realPath = new File(path);
        if (!realPath.exists()){
            realPath.mkdirs();
        }

        //上传文件地址
        System.out.println("上传文件保存地址："+realPath);

        //解决文件名字问题：使用uuid;
        String filename = "pg-"+ UUID.randomUUID().toString().replaceAll("-", "")+".jpg";
        File newfile = new File(realPath, filename);
        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        try {
            file.transferTo(newfile);
        } catch (IOException e) {
            e.printStackTrace();
            return new MdRes(0,"上传失败",null);
        }
        //给editormd进行回调
        String url = "http://localhost:9958/upload/"+ filename;
        return new MdRes(1,"上传成功",url);
    }

    //上传封面
    @ResponseBody
    @RequestMapping("/upload/cover")
    public Result Upload(MultipartFile file){

        String path = "D:/blog/cover/";

        File realPath = new File(path);
        if (!realPath.exists()){
            realPath.mkdirs();
        }

        //上传文件地址
        System.out.println("上传文件保存地址："+realPath);

        //解决文件名字问题：使用uuid;
        String filename = "pg-"+ UUID.randomUUID().toString().replaceAll("-", "")+".jpg";
        File newfile = new File(realPath, filename);
        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        try {
            file.transferTo(newfile);
        } catch (IOException e) {
            e.printStackTrace();
            return Result.fail("上传失败");
        }
        //给editormd进行回调
        String url = "/imp/"+ filename;
        Map<String, String> map = new HashMap<>();
        map.put("src",url);
        return Result.success(map,null);
    }

    //撰写博客
    @GetMapping("/write")
    public String write(Model model){
        List<Category> categoryList = categoryService.list();
        List<TagRes> tags = articleTagService.tagList();
        model.addAttribute("list",categoryList);
        model.addAttribute("tag",tags);
        return "/admin/text";
    }

    @ResponseBody
    @PostMapping("/addArticle")
    public Result<Object> addArticle(ArticleRes articleRes){
        articleRes.setCreateTime(new Date());
        String[] tagNames = articleRes.getTagName();
        String[] categoryNames = articleRes.getCatName();
        articleService.add(articleRes);
        String title = articleRes.getArticleTitle();
        Integer articleId = articleService.getArticleId(title);
        for (int i = 0; i < tagNames.length; i++){
            String tagName = tagNames[i];
            if (tagService.getTagId(tagName) == null){
                Date createTime = new Date();
                tagService.add(tagName,createTime);
                Integer tagId = tagService.getTagId(tagName);
                articleTagService.add(articleId,tagId);
            }else {
                Integer tagId = tagService.getTagId(tagName);
                articleTagService.add(articleId,tagId);
            }
        }
        for (int c = 0; c < categoryNames.length; c++){
            String categoryName = categoryNames[c];
            if (categoryService.getCategoryId(categoryName) == null){
                Date createTime = new Date();
                categoryService.add(categoryName,createTime);
                Integer categoryId = categoryService.getCategoryId(categoryName);
                articleService.setCategoryId(articleId,categoryId);
            }else {
                Integer categoryId = categoryService.getCategoryId(categoryName);
                articleService.setCategoryId(articleId,categoryId);
            }
        }
        return Result.success("文章发布成功");
    }

    @ResponseBody
    @RequestMapping("/tag")
    public Object tag(){
        HashMap<String, Object> map = new HashMap<>();
        List<TagRes> list = articleTagService.tagList();
        map.put("code",0);
        map.put("msg","success");
        map.put("data",list);
        return map;
    }

    @ResponseBody
    @RequestMapping("/category")
    public Object category(){
        HashMap<String, Object> map = new HashMap<>();
        List<CategoryRes> list = articleTagService.categoryList();
        map.put("code",0);
        map.put("msg","success");
        map.put("data",list);
        return map;
    }
}
