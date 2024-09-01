package com.leeni.sample.exception;

import com.leeni.sample.dto.ExceptionResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class CustomExceptionHandler {

    @ExceptionHandler(Exception.class) // Exception 터지면 작동
    public ResponseEntity<?> apiException(Exception e) {
        e.printStackTrace();
        return new ResponseEntity<>(new ExceptionResponseDTO<>(-1,e.getMessage(),null), HttpStatus.BAD_REQUEST);
    }
}
