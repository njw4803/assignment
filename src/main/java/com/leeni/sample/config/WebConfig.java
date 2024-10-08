package com.leeni.sample.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/userListPage").setViewName("user/userList");
        registry.addViewController("/boardListPage").setViewName("board/boardList");
        registry.addViewController("/salesInquiryPage").setViewName("user/salesInquiry");
    }
}
