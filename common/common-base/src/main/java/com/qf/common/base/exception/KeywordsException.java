package com.qf.common.base.exception;

import com.qf.common.base.resp.ResponseStatus;

/**
 * @author 仇国轩
 */
public class KeywordsException extends BaseException{
    public KeywordsException(ResponseStatus response) {
        super(response);
    }
}
