package com.bolan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/admin/welcome").setViewName("admin/welcome");
        registry.addViewController("/admin/article").setViewName("admin/table");
//        registry.addViewController("/admin/write").setViewName("admin/simple");
//        registry.addViewController("/article").setViewName("article");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/imp/**")
                .addResourceLocations("file:D:/blog/cover/");
        registry.addResourceHandler("/upload/**")
                .addResourceLocations("file:D:/blog/upload/");
    }

}
