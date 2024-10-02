package com.wei.furn.Service.impl;

import com.wei.furn.Service.numsService;
import com.wei.furn.bean.nums;
import com.wei.furn.dao.numsDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class numsServiceImpl implements numsService {
   @Resource
   private numsDao numsdao;

    @Override
    public nums getNums(long isbn) {
        return numsdao.getNums(isbn);
    }
}
