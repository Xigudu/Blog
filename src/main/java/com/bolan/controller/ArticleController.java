package com.bolan.controller;

import com.bolan.pojo.Category;
import com.bolan.pojo.Tag;
import com.bolan.pojo.vo.ArticleQuery;
import com.bolan.pojo.vo.ArticleRes;
import com.bolan.pojo.vo.HotArticle;
import com.bolan.pojo.vo.Result;
import com.bolan.service.ArticleService;
import com.bolan.service.ArticleTagService;
import com.bolan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private ArticleTagService articleTagService;
    @Autowired
    private CategoryService categoryService;
    //推荐博客
    @GetMapping(value ={"/index","/"})
    public String index(Model model){
        List<HotArticle> hotList = articleService.hotList();
        model.addAttribute("hotList",hotList);
        System.out.println(hotList);
        return "index";
    }
    //阅读博客
    @GetMapping("/article/{id}")
    public String article(@PathVariable Integer id, Model model){
        ArticleRes article = articleService.getArticleById(id);
        model.addAttribute("blog",article);
        System.out.println(article);
        return "read";
    }
    //博客列表
    @GetMapping("/article")
    public String list(Model model,ArticleQuery articleQuery){
        List<ArticleRes> list = articleService.getList(articleQuery);
        System.out.println(list);
        model.addAttribute("list",list);
        return "article";
    }

}
