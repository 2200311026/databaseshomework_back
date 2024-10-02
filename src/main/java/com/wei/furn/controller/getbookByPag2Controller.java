package com.wei.furn.controller;

import com.wei.furn.Service.getbookByPag2Service;
import com.wei.furn.bean.book;
import com.wei.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class getbookByPag2Controller {

@Resource
private getbookByPag2Service bookByPag2Service;


@GetMapping("/getbookByPag2")
public Result getbookByPag2(@RequestParam int pageNum,@RequestParam int pageSize){
    List<book> books = bookByPag2Service.getbookByPag2(pageNum,pageSize);
        return Result.success(books);
}

}
