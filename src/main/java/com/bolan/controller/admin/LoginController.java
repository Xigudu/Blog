package com.bolan.controller.admin;

import com.bolan.pojo.vo.Result;
import com.bolan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    private UserService userService;

    //跳转到登录页面
    @GetMapping
    public String loginPage(){
        return "admin/login";
    }
    //跳转到首页
    @GetMapping("/index")
    public String index(){
        return "admin/index";
    }

    //登录检验
    @ResponseBody
    @PostMapping("/login")
    public Result login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session) {
        User user = userService.getUser(username, password);
        if (user != null) {
            user.setPassword(null);
            session.setAttribute("user",user);
            return Result.success();
        } else {
            return Result.fail("用户名或密码错误");
        }
    }

    //注销功能
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "admin/login";
    }
}
