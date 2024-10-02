package com.wei.furn.controller;

import com.wei.furn.Service.getUserInfoService;
import com.wei.furn.bean.userr;
import com.wei.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
public class getUserInfoController {

    @Resource
    private getUserInfoService getUserInfoService;

    @GetMapping("getUserInfo")
    public Result getUserInfo(@RequestParam long id){
        return Result.success(getUserInfoService.getUserInfo(id));
    }

    @PutMapping("/changeUserInfo")
    public Result changeUserInfo(@RequestBody userr user){
        System.out.println(user);
        getUserInfoService.changeUserInfo(user);
         return Result.success("更新成功");
    }

    @GetMapping("/getUserPassword")
    public Result getUserPassword(@RequestParam long id,@RequestParam String oldPassword){
        System.out.println("进入验证密码Controller");
        Boolean ifSame = getUserInfoService.getUserPassword(id, oldPassword);
        return Result.success(ifSame);
    }

    @PutMapping("/updatePassword")
    public Result updatePassword(@RequestParam long id,@RequestParam String newPassword){
        System.out.println("进入修改密码Controller");
        Boolean isChange = getUserInfoService.updatePassword(id, newPassword);
        return Result.success(isChange);
    }

    @GetMapping("/getName")
    public Result getName(@RequestParam long id){
        return Result.success(getUserInfoService.getName(id));
    }

    @GetMapping("/getMoney")
    public Result getMoney(@RequestParam long id) {
        return Result.success(getUserInfoService.getMoney(id));
    }

    @PutMapping("/addMoney")
    public Result addMoney(@RequestParam long id,@RequestParam long money) {
        getUserInfoService.addMoney(id, money);
        return Result.success("添加成功");
    }

    @GetMapping("/allPenalty")
    public Result allPenalty(long id) {
        return Result.success(getUserInfoService.allPenalty(id));
    }
}
