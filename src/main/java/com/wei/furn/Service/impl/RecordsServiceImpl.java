package com.wei.furn.Service.impl;

import com.wei.furn.Service.RecordsService;
import com.wei.furn.bean.records;
import com.wei.furn.dao.RecordsDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class RecordsServiceImpl implements RecordsService {

    @Resource
    private RecordsDao recordsDao;

    @Override
    public List<records> getRecordsInfo() {
        return recordsDao.getRecordsInfo();
    }

    @Override
    public void changePenalty(long penalty, long recordId) {
        recordsDao.changePenalty(penalty, recordId);
    }

    @Override
    public void isTimeOut(long recordId) {
        recordsDao.isTimeOut(recordId);
    }

    @Override
    public void PenaltyAdd(long recordId) {
        recordsDao.PenaltyAdd(recordId);
    }

    @Override
    public List<records> getUerRecord(long userId) {
        return recordsDao.getUerRecord(userId);
    }
}
