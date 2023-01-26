package com.bolan.controller;

import com.bolan.pojo.vo.ArticleRes;
import com.bolan.pojo.vo.HotArticle;
import com.bolan.service.ArticleService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/")
    public String index(Model model){
        //最热博客推荐
        List<HotArticle> hotList = articleService.hotList();
        model.addAttribute("hotList",hotList);
        System.out.println(hotList);
        return "index";
    }

    @GetMapping("/article/{id}")
    public String blog(@PathVariable Integer id, Model model){
        ArticleRes article = articleService.getArticleById(id);
        model.addAttribute("blog",article);
        System.out.println(article);
        return "read";
    }
}
