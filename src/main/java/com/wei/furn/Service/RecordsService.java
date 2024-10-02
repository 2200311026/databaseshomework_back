package com.wei.furn.Service;

import com.wei.furn.bean.records;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecordsService {
    List<records> getRecordsInfo();
    void changePenalty(long penalty,long recordId);
    void isTimeOut(long recordId);
    void PenaltyAdd(long recordId);
    List<records> getUerRecord(long userId);
}
