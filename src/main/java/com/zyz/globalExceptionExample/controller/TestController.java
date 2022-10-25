package com.zyz.globalExceptionExample.controller;

import com.zyz.globalExceptionExample.common.ApiResponse;
import com.zyz.globalExceptionExample.constants.StateCode;
import com.zyz.globalExceptionExample.exception.LoginException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test1")
    public ApiResponse<Integer> test1() {
        Integer aa = 100/0;
        return ApiResponse.ok(aa);
    }

    @GetMapping("test2")
    public ApiResponse test2() {
        throw new LoginException(StateCode.SERVER_ERROR);
    }

}
