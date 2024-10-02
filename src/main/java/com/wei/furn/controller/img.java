package com.wei.furn.controller;

import com.wei.furn.Service.UserImgService;
import com.wei.furn.util.AliOSSUtils;
import com.wei.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@Slf4j
public class img {

    @Resource
    private UserImgService userImgService;
    @Resource
    private AliOSSUtils aliOSSUtils;

    @PostMapping(value = "/uploadAvatar")
    public Result imgUpDown(@RequestParam("file") MultipartFile file,@RequestParam long id) throws IOException {

            if(!file.isEmpty()) {
                if(userImgService.ifsaveId(id)!=null){
                    System.out.println("你之前上传过头像，现在为你更新头像");
                    System.out.println("当前用户的id："+id);
                    log.info("上传过来的参数：{}", file.getOriginalFilename());
                    //调用阿里云OSS工具类【AliOSSUtiles】进行文件上传
                    String url = aliOSSUtils.upload(file);
                    userImgService.putImgUrl(id,url);//更新头像
                    log.info("文件上传完成，url是：{}", url);
                    return Result.success(url);

//                    String fileName = file.getOriginalFilename(); //G的猫.jpg
//                    String suffixName = fileName.substring(fileName.indexOf(".")); //G的猫
//                    //设置上传文件的保存地址目录
//                    String dirpath="C:\\Users\\mzby\\Desktop\\Back_end\\数据库大作业\\数据库大作业\\springboot_furn\\springboot_furn\\src\\main\\resources\\static";
//                    System.out.println("dirpath="+dirpath);
//                    File parentFilePath=new File(dirpath);
//                    //如果保存文件不存在就先创建目录
//                    if(!parentFilePath.exists()) {
//                        parentFilePath.mkdir();
//                    }
//                    String fileNewName = UUID.randomUUID() + fileName;//在UUID+G的猫
//                    File newFile = new File(parentFilePath, fileNewName);//图片上传到的路径 和图片名
//                    file.transferTo(newFile);//上传图片
//                    System.out.println("newFile="+newFile);
//                    System.out.println("上传图片的user_id="+id);
//                    String baseUrl = "http://localhost:9090"; // 假设你的 Spring Boot 应用运行在本地 8080 端口
//                    String imageUrl = baseUrl + "/" + fileNewName;
//                    System.out.println("imageUrl="+imageUrl);

//                    userImgService.putImgUrl(id,imageUrl);//更新头像
//                    return Result.success(imageUrl);
                }else {

                    System.out.println("你说明你第一次上传头像");
                    System.out.println("当前用户的id："+id);
                    log.info("上传过来的参数：{}", file.getOriginalFilename());
                    //调用阿里云OSS工具类【AliOSSUtiles】进行文件上传
                    String url = aliOSSUtils.upload(file);
//                    userImgService.putImgUrl(id,url);//更新头像
                    userImgService.insertId(id,url);//新插入一条信息
                    log.info("文件上传完成，url是：{}", url);
                    return Result.success(url);

//                    String fileName = file.getOriginalFilename(); //G的猫.jpg
//                    String suffixName = fileName.substring(fileName.indexOf(".")); //G的猫
//                    //设置上传文件的保存地址目录
//                    String dirpath="C:\\Users\\mzby\\Desktop\\Back_end\\数据库大作业\\数据库大作业\\springboot_furn\\springboot_furn\\src\\main\\resources\\static";
//                    System.out.println("dirpath="+dirpath);
//                    File parentFilePath=new File(dirpath);
//                    //如果保存文件不存在就先创建目录
//                    if(!parentFilePath.exists()) {
//                        parentFilePath.mkdir();
//                    }
//                    String fileNewName = UUID.randomUUID() + fileName;//在UUID+G的猫
//                    File newFile = new File(parentFilePath, fileNewName);//图片上传到的路径 和图片名
//                    file.transferTo(newFile);//上传图片
//                    System.out.println("newFile="+newFile);
//                    System.out.println("上传图片的user_id="+id);
//                    String baseUrl = "http://localhost:9090"; // 假设你的 Spring Boot 应用运行在本地 8080 端口
//                    String imageUrl = baseUrl + "/" + fileNewName;
//                    System.out.println("imageUrl="+imageUrl);
//                    // 这里可以添加将图片路径保存到数据库的逻辑（如果需要的话）
//
//                    userImgService.insertId(id,imageUrl);//新插入一条信息
//                    return Result.success(imageUrl);//返回头像
                }

            }
            return null;
        }
    }

