package com.wei.furn.controller;

import com.wei.furn.Service.UserImgService;
import com.wei.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class UserImgController {

    @Resource
    private UserImgService userImgService;

    @GetMapping("/getImgUrl")//通过id得到图片路径
    public Result getImgUrl(@RequestParam long id) {
        return Result.success(userImgService.getImgUrl(id));
       //return userImgService.getImgUrl(id);//根据id得到数据库中的url
    }

    @PutMapping("/putImgUrl")//通过id更新图片路径
    public void putImgUrl(@RequestParam long id,@RequestParam String img) {
        userImgService.putImgUrl(id, img);

    }

    @GetMapping("/ifsaveId")//通过id判断 是否在表中存在
    public Long ifSaveId(@RequestParam Long id) {
        if (userImgService.ifsaveId(id)!=null) {
            return userImgService.ifsaveId(id);
        }else {
            return null;
        }

    }

    @PostMapping("/insertId")//通过id和图片路径 插入表中
    public void insertId(@RequestParam long id,@RequestParam String img) {
        userImgService.insertId(id, img);
    }
}
