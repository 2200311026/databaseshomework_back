package com.wei.furn.controller;

import com.wei.furn.Service.UserImgService;
import com.wei.furn.Service.showBookService;
import com.wei.furn.util.AliOSSUtils;
import com.wei.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@Slf4j
public class bookimg {

    @Resource
    private showBookService bookService;
    @Resource
    private AliOSSUtils aliOSSUtils;

    @PostMapping(value = "/uploadAvatarBook")
    public Result imgUpDown(@RequestParam("file") MultipartFile file, @RequestParam long isbn) throws IOException {

        System.out.println("当前图书的isbn："+isbn);
        log.info("上传过来的参数：{}", file.getOriginalFilename());
        //调用阿里云OSS工具类【AliOSSUtiles】进行文件上传
        String url = aliOSSUtils.upload(file);
        bookService.changeImg(url,isbn);
        log.info("文件上传完成，url是：{}", url);
        return Result.success(url);
//
//                String fileName = file.getOriginalFilename(); //G的猫.jpg
//                String suffixName = fileName.substring(fileName.indexOf(".")); //G的猫
//                //设置上传文件的保存地址目录
//                String dirpath="C:\\Users\\mzby\\Desktop\\Back_end\\数据库大作业\\数据库大作业\\springboot_furn\\springboot_furn\\src\\main\\resources\\static";
//                System.out.println("dirpath="+dirpath);
//                File parentFilePath=new File(dirpath);
//                //如果保存文件不存在就先创建目录
//                if(!parentFilePath.exists()) {
//                    parentFilePath.mkdir();
//                }
//                String fileNewName = UUID.randomUUID() + fileName;//在UUID+G的猫
//                File newFile = new File(parentFilePath, fileNewName);//图片上传到的路径 和图片名
//                file.transferTo(newFile);//上传图片
//                System.out.println("newFile="+newFile);
//                String baseUrl = "http://localhost:9090"; // 假设你的 Spring Boot 应用运行在本地 8080 端口
//                String imageUrl = baseUrl + "/" + fileNewName;
//                System.out.println("imageUrl="+imageUrl);
//
//                bookService.changeImg(imageUrl,isbn);//更改数据库对应isbn书的url
//
//                return Result.success(imageUrl);
        }

    }

