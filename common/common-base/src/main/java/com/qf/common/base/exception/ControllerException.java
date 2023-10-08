package com.qf.common.base.exception;


import com.qf.common.base.resp.ResponseStatus;

public class ControllerException extends BaseException{

    public ControllerException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}
