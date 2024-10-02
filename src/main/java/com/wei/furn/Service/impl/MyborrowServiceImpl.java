package com.wei.furn.Service.impl;

import com.wei.furn.Service.MyborrowService;
import com.wei.furn.bean.Myborrow;
import com.wei.furn.dao.MyBorrowDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class MyborrowServiceImpl implements MyborrowService {

    @Resource
    MyBorrowDao myBorrowDao;


    @Override //逻辑处理
    public List<Myborrow> getMyborrow(int id) {
       return myBorrowDao.getMyborrowDao(id);
    }
}
