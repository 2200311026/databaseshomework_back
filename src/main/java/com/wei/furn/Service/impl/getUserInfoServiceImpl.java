package com.wei.furn.Service.impl;

import com.wei.furn.Service.getUserInfoService;
import com.wei.furn.bean.userr;
import com.wei.furn.dao.userInfoDao;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class getUserInfoServiceImpl implements getUserInfoService {
    @Resource
    private userInfoDao userInfoDao;

    @Override
    public userr getUserInfo(long id) {
        return userInfoDao.getUserInfo(id);
    }


    @Override
    public void changeUserInfo(userr user) {
        userInfoDao.changeUserInfo(user);
    }

    @Override
    public Boolean getUserPassword(long id, String oldPassword) {
        String userPassword = userInfoDao.getUserPassword(id);
        if(userPassword.equals(DigestUtils.md5Hex(oldPassword))){ //前端传id 和 oldpassword 但经过数据库的只有id 得到数据库返回的密码
            //用数据库返回的密码与前端传过来的密码作对比 如果一样则返回true
            System.out.println("老密码验证成功");
            return true;
        }else {
            System.out.println("老密码验证失败");
            return false;
        }
    }

    @Override
    public Boolean updatePassword(long id, String newpwd) {
        userInfoDao.updatePassword(id, DigestUtils.md5Hex(newpwd));//先对密码加密再进行传输
        return true;
    }

    @Override
    public String getName(long id) {
        return userInfoDao.getName(id);
    }

    @Override
    public long getMoney(long id) {
        return userInfoDao.getMoney(id);
    }

    @Override
    public void addMoney(long id, long money) {
        userInfoDao.addMoney(id, money);
    }

    @Override
    public Integer allPenalty(long id) {
         if(userInfoDao.allPenalty(id)==null)
         {
             return 0;
         }else {
             return userInfoDao.allPenalty(id);
         }
    }


}
