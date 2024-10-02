package com.wei.furn.controller;

import com.wei.furn.Service.loginService;
import com.wei.furn.bean.login;
import com.wei.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class loginController {

    @Resource
    private loginService loginService;

    @PostMapping("/login")
    public Result login(@RequestBody login login) {

        System.out.println(login.getName());
        System.out.println(login.getPwd());
        boolean logined = loginService.login(login.getName(),login.getPwd());
        if (logined) {
            return Result.success();
        }else {
            return Result.error("403","你输入的账号或密码有误");
        }
    }

    @GetMapping("/getUserId")
    public Result getUserId(@RequestParam String username) {
        System.out.println("能调用");
        return Result.success(loginService.getUserId(username));
    }

    @GetMapping("/Getadmin")
    public Result Getadmin(@RequestParam long id) {
        return Result.success(loginService.GetAdmin(id));
    }

}
