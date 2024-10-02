package com.wei.furn.dao;

import com.wei.furn.bean.records;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecordsDao {
    List<records> getRecordsInfo();
    void changePenalty(long penalty,long recordId);
    void isTimeOut(long recordId);
    void PenaltyAdd(long recordId);
    List<records> getUerRecord(long userId);
}
