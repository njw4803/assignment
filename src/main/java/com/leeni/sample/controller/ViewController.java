package com.leeni.sample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ViewController {

    @GetMapping("/")
    public String main() {
        log.info("/ url 호출 -> login.html 이동");
        return "login";
    }
}
