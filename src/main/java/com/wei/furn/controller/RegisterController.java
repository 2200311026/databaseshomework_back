package com.wei.furn.controller;

import com.wei.furn.Service.RegisterService;
import com.wei.furn.bean.Register;
import com.wei.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class RegisterController {

    @Resource
    private RegisterService registerService;

    @PostMapping("/register")
    public Result Register(@RequestBody Register register) {

        registerService.register(register);
        return Result.success("注册成功");
    }

}
