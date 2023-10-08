package com.qf.common.base.handler;

import com.qf.common.base.exception.BaseException;
import com.qf.common.base.resp.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理：
 * 1.拦截Controller层所有的方法，对其进行异常通知增强（在类上使用注解@RestControllerAdvice 或者 @ControllerAdvice）
 * 2.公开的方法上声明需要处理的异常
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseResult<Object> exceptionHandler(Exception e){
        //控制台输错错误
        e.printStackTrace();
        //日志捕获异常
        //log.error(e.getMessage());
        return ResponseResult.error();
    }

    @ExceptionHandler(BaseException.class)
    public ResponseResult<Object> baseExceptionHandler(BaseException baseException){
        //控制台输错错误
        baseException.printStackTrace();
        //日志捕获异常
        //log.error(baseException.getMessage());
        return ResponseResult.error(baseException.getResponseStatus());
    }
}
