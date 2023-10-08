package com.qf.common.base.exception;


import com.qf.common.base.resp.ResponseStatus;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private final ResponseStatus responseStatus;

    public BaseException(ResponseStatus responseStatus){
        this.responseStatus = responseStatus;
        super.printStackTrace();
    }
}
