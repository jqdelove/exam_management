package com.jinqi.exam.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常捕获处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 捕获运行时异常
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    public String resultError(){
        return "jsp/fail";
    }

    @ExceptionHandler(Exception.class)
    public String error(){
        return "jsp/fail";
    }
}
