package com.panda.demo.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionAdvice {

    @ExceptionHandler
    public R handleException(Exception ex) {
        ex.printStackTrace();
        return new R("服务器故障，请稍候再试");
    }

}
