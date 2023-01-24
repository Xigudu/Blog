package com.bolan.controller.admin;

import com.bolan.mapper.ArticleMapper;
import com.bolan.mapper.CategoryMapper;
import com.bolan.pojo.ArticleTag;
import com.bolan.pojo.Category;
import com.bolan.pojo.Tag;
import com.bolan.pojo.vo.ArticleQuery;
import com.bolan.pojo.vo.ArticleRes;
import com.bolan.pojo.vo.Result;
import com.bolan.service.ArticleService;
import com.bolan.service.ArticleTagService;
import com.bolan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
//        model.addAttribute("list", list);
        return Result.success(list,count);
    }

}
