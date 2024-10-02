package com.wei.furn.controller;

import com.wei.furn.Service.RecordsService;
import com.wei.furn.bean.records;
import com.wei.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class RecordsController {
    @Resource
    private RecordsService recordsService;

    @GetMapping("/getRecordsInfo")
    public Result getRecords(){
        return Result.success(recordsService.getRecordsInfo());
    }

    @PutMapping("/changePenalty")
    public Result changePenalty(@RequestParam long penalty,@RequestParam long recordId){
        recordsService.changePenalty(penalty,recordId);
        return Result.success("罚金修改成功");
    }

    @PutMapping("/isTimeOut")
    public Result isTimeOut(@RequestParam long recordId){
        recordsService.isTimeOut(recordId);
        return  Result.success();
    }

    @PutMapping("/PenaltyAdd")
    public Result PenaltyAdd(@RequestParam long recordId){
        recordsService.PenaltyAdd(recordId);
        return Result.success();
    }

    @GetMapping("/getUerRecord")
   public Result getUerRecord(@RequestParam long id){
        return Result.success(recordsService.getUerRecord(id));
    };
}
