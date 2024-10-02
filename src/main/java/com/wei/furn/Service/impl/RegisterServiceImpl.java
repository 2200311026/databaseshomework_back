package com.wei.furn.Service.impl;

import com.wei.furn.Service.RegisterService;
import com.wei.furn.bean.Register;
import com.wei.furn.dao.RegisterDao;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    RegisterDao registerDao;

    @Override
    public void register(Register register) {
        //业务处理对传过来的密码进行加密
        System.out.println("加密前pwd:"+register.getPwd());
        register.setPwd(DigestUtils.md5Hex(register.getPwd()));
        System.out.println("加密后pwd:"+register.getPwd());
        registerDao.insertUser(register);
    }
}
