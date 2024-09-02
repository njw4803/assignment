package com.leeni.sample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ViewController {

    @GetMapping("/")
    public String loginPage() {
        log.info("/ url 호출 -> login.html 이동");
        return "login";
    }

    @GetMapping("/userListPage")
    public String userListPage() {
        log.info("/ url 호출 -> userList.html 이동");
        return "user/userList";
    }

    @GetMapping("/boardListPage")
    public String boardListPage() {
        log.info("/ url 호출 -> boardList.html 이동");
        return "board/boardList";
    }

    @GetMapping("/salesInquiryPage")
    public String salesInquiryPage() {
        log.info("/ url 호출 -> salesInquiry.html 이동");
        return "user/salesInquiry";
    }

}
