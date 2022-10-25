package com.zyz.globalExceptionExample.exception;


import com.zyz.globalExceptionExample.constants.StateCode;

public class LoginException extends BaseException {
    public LoginException(StateCode stateCode) {
        super(stateCode);
    }
}
