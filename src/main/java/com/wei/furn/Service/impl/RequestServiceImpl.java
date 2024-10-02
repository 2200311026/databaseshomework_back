package com.wei.furn.Service.impl;

import com.wei.furn.Service.RequestService;
import com.wei.furn.bean.Request;
import com.wei.furn.dao.RequestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RequestServiceImpl implements RequestService {

    @Resource
    RequestDao requestDao;


    @Override
    public void getRequest(Request request) {
        requestDao.RequestBorrow(request);
    }

    @Override
    public void DeleteRequest(long requestId) {
        requestDao.DeleteRequest(requestId);
    }

    @Override
    public void updataBorrowState(long requestId) {
        requestDao.updataBorrowState(requestId);
    }
}
