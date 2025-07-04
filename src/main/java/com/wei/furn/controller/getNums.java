package com.wei.furn.controller;

import com.wei.furn.Service.numsService;
import com.wei.furn.bean.nums;

import com.wei.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class getNums {
    @Resource
    private numsService service;

    @PostMapping("/getNums")
    public Result getNums(@RequestParam long isbn) {
        return Result.success(service.getNums(isbn));
    }
}
