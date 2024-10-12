package com.leeni.sample.controller;

import com.leeni.sample.dto.ResponseDTO;
import com.leeni.sample.dto.user.RequestUserDTO;
import com.leeni.sample.dto.user.ResponseUserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ApiController {

    @PostMapping("/login")
    public ResponseDTO login(@RequestBody RequestUserDTO requestUserDTO) {

        ResponseUserDTO responseUserDTO = ResponseUserDTO.builder().build();
        log.info("responseUserDTO = {}", responseUserDTO);
        log.info("requestUserDTO = {}", requestUserDTO);
        return null;
    }
}
