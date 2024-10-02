package com.wei.furn.Service.impl;

import com.wei.furn.Service.UserImgService;
import com.wei.furn.dao.UserImgDao;
import org.apache.ibatis.annotations.Lang;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserImgServiceImpl implements UserImgService {

   @Resource
   private UserImgDao userImgDao;

    @Override
    public String getImgUrl(long id) {
        return userImgDao.getImgUrl(id);
    }

    @Override
    public void putImgUrl(long id, String img) {
            userImgDao.putImgUrl(id, img);
    }

    @Override
    public Long ifsaveId(Long id) {
        if (userImgDao.ifsaveId(id)!=null) {
            return userImgDao.ifsaveId(id);
        }else {
            return null;
        }
    }

    @Override
    public void insertId(long id, String img) {
            userImgDao.insertId(id, img);
    }
}
