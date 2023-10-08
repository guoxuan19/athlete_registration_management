package com.qf.common.base.exception;


import com.qf.common.base.resp.ResponseStatus;

public class ServiceException extends BaseException{

    public ServiceException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}
