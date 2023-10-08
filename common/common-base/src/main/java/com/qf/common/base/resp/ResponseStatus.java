package com.qf.common.base.resp;

import lombok.Getter;

@Getter
public enum ResponseStatus {
    SUCCESS(200,"成功"),
    SYS_ERROR(400,"系统错误"),


    ;

    private Integer code;
    private String message;

    ResponseStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
