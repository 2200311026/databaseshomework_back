package com.wei.furn.controller;

import com.wei.furn.Service.RequestService;
import com.wei.furn.bean.Request;
import com.wei.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class RequestController {

@Resource
RequestService requestService;

@PostMapping("/request")
    public Result Resquest(@RequestBody Request request) {
            requestService.getRequest(request);
            return Result.success("已发送请求,请等待审核!");
    }
    @DeleteMapping("/DeleteRequest")
    public Result DeleteRequest(@RequestParam long requestId) {
        System.out.println("过来了1");
        requestService.DeleteRequest(requestId);
        return Result.success("还书成功");
    }

    @PutMapping("/updateBorrowState")
    public Result updataBorrowState(@RequestParam long requestId) {
        System.out.println("过来了2");
        requestService.updataBorrowState(requestId);
        return Result.success("更新状态成功");
    }
}
