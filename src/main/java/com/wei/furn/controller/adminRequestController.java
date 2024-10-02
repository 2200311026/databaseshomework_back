package com.wei.furn.controller;

import com.wei.furn.Service.RequestService;
import com.wei.furn.Service.adminRequestService;
import com.wei.furn.bean.adminRequest;
import com.wei.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class adminRequestController {

    @Resource
    private adminRequestService requestService;

    @GetMapping("/adminRequest")
    public Result getAdminRequest(){

        return Result.success(requestService.adminRequestservice());
    }

}
