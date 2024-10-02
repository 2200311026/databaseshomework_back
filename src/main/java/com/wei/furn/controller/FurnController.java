//package com.wei.furn.controller;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.core.toolkit.Wrappers;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.wei.furn.Service.FurnService;
//import com.wei.furn.bean.Furn;
//import com.wei.furn.util.Result;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Controller;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//@Slf4j//输出日志
//@RestController
//public class FurnController {
//    //装配srevice
//    @Resource
//    private FurnService furnService;
//
//    //完成添加方法
//    //什么时候使用@RequestBody 1.如果前端以json格式来发送添加信息furn才需要加上该注解
//    //2.如果前端以表单形式提交了信息，则不需要加上该注解，会自动封装到furn
//    //3.类似 前端若以表单形式发送请求 则需要后端 REST
//    @PostMapping("/save")
//    public Result save(@RequestBody Furn furn){
//        log.info("furn={}",furn);
//        furnService.save(furn);
//        return Result.success();//因为为添加家居 所以返回成功信息不需要携带信息
//    }
//
//    //返回所有家居信息，后面再考虑分页显示 即分页返回信息
//    @RequestMapping("/furns") //@RequestMapping 可以接受get请求 或者 post请求
//    public Result listFurns(){
//        List<Furn> furns = furnService.list();
//        return Result.success(furns);//返回的数据是泛型所有这里返回的数据类型是 List一个集合
//    }
//
//    //处理修改 我们使用Rest风格，修改请求所以用put更新请求
//    @PutMapping("/update")
//    public Result updata(@RequestBody Furn furn){
//        furnService.updateById(furn);//这个方法是mybatis-plus提供的
//        return Result.success();
//    }
//
//    //删除家居信息
//    @DeleteMapping("/del/{id}")
//    public Result del(@PathVariable Integer id){
//        furnService.removeById(id);
//        return Result.success();
//    }
//
//    //根据id返回对应家居信息
//    @GetMapping("/find/{id}")
//    public Result findById(@PathVariable Integer id){
//        Furn furn = furnService.getById(id);
//        return Result.success(furn);
//    }
//
//    //分页查询的接口/方法
//    @GetMapping("/furnsByPage")
//    public Result listFurnsByPage(@RequestParam(defaultValue = "1") Integer pageNum, //默认展示第一页
//                                  @RequestParam(defaultValue = "5") Integer pageSize){//默认页有5条信息
//        //原生java web 项目 讲过分页模型，底层机制类似
//        //这里同过page方法，返回了page对象，对象中就封装了分页数据。这里的方法都是mybatis-plus提供的。
//        Page<Furn> page = furnService.page(new Page<>(pageNum, pageSize));
//        //注意观察，返回的page数据结构是如何的？这样你才知道在前端如何绑定返回的数据
//        return Result.success(page);
//    }
//
//    //方法：可以支持带条件的检索
//    @GetMapping("/furnsBySearchPage")
//    public Result listFurnsByConditionPage(
//            @RequestParam(defaultValue = "1") Integer pageNum, //默认展示第一页
//            @RequestParam(defaultValue = "5") Integer pageSize,//每页展示数据条数
//            @RequestParam(defaultValue = "") String search//检索条件--家居名字 默认是空表示正常分页不带条件检索
//    ){
//        //先创建QueryWrapper，可以将我们的检索条件封装到QueryWrapper中
//        QueryWrapper<Furn> queryWrapper = Wrappers.query();
//        //判读search是否有内容即是否有检索条件
//        if(StringUtils.hasText(search)){//如果search有值
//            //column对应数据库表中的某一个字段
//            queryWrapper.like("name",search);//通过条件search去查询数据库中"字段"
//            //检索条件已经封装到QueryWrapper中
//        }
//        Page<Furn> page = furnService.page(new Page<>(pageNum, pageSize), queryWrapper);
//        //page为条件查询的结果
//        return Result.success(page);
//    }
//}
