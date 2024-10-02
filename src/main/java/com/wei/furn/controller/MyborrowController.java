package com.wei.furn.controller;

import com.wei.furn.Service.MyborrowService;
import com.wei.furn.bean.Myborrow;
import com.wei.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class MyborrowController {  //通过用户id 关联请求表获取 用户借书状态和借的书信息

    @Resource
    private MyborrowService myborrowService;

    @GetMapping("/getMyborrow")
    public Result getMyborrow(@RequestParam int id) {
        System.out.println("--------------");
        System.out.println(myborrowService.getMyborrow(id));
        System.out.println("--------------");
        return Result.success(myborrowService.getMyborrow(id));
    }

}
