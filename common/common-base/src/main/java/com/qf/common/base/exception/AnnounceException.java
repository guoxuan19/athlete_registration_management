package com.qf.common.base.exception;

import com.qf.common.base.resp.ResponseStatus;

public class AnnounceException extends BaseException{

    public AnnounceException(ResponseStatus response) {
        super(response);
    }
}
