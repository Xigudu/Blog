package com.bolan.controller.admin;

import com.bolan.pojo.vo.ArticleQuery;
import com.bolan.pojo.vo.ArticleRes;
import com.bolan.pojo.vo.Result;
import com.bolan.service.ArticleService;
import com.bolan.service.ArticleTagService;
import com.bolan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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



}
