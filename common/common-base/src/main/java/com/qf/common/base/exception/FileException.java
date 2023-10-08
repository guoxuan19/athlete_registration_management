package com.qf.common.base.exception;

import com.qf.common.base.resp.ResponseStatus;

/**
 * @author 仇国轩
 */
public class FileException extends BaseException{
    public FileException(ResponseStatus response) {
        super(response);
    }
}
