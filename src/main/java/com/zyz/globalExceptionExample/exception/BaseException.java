package com.zyz.globalExceptionExample.exception;

import com.zyz.globalExceptionExample.constants.StateCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseException extends RuntimeException{

    private Integer code;

    private String msg;

    public BaseException(StateCode stateCode) {
        super(stateCode.getMsg());
        this.code = stateCode.getCode();
        this.msg = stateCode.getMsg();
    }
}
