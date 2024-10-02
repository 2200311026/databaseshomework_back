package com.wei.furn.Service.impl;

import com.wei.furn.Service.adminRequestService;
import com.wei.furn.bean.adminRequest;
import com.wei.furn.dao.adminRequestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class adminRequestserviceImpl implements adminRequestService {

    @Resource
    private adminRequestDao adminRequestDao;

    @Override
    public List<adminRequest> adminRequestservice() {
       return adminRequestDao.adminRequestdao();
    }
}
