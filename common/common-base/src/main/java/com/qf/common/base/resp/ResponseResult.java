package com.qf.common.base.resp;

import lombok.Data;

@Data
public class ResponseResult<T> {
    private  Integer code;
    private String message;
    private T data;

    private ResponseResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> ResponseResult<T> success(ResponseStatus responseStatus, T data){
        return new ResponseResult<>(responseStatus.getCode(), responseStatus.getMessage(),data);
    }

    public static <T> ResponseResult<T> success(T data){
        return success(ResponseStatus.SUCCESS,data);
    }

    public static <T> ResponseResult<T> error(ResponseStatus responseStatus){
        return new ResponseResult<>(responseStatus.getCode(), responseStatus.getMessage(),null);
    }

    public static <T> ResponseResult<T> error(){
        return error(ResponseStatus.SYS_ERROR);
    }

}
