package com.wei.furn.Service.impl;

import com.wei.furn.Service.loginService;
import com.wei.furn.bean.login;
import com.wei.furn.dao.loginDao;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class loginServiceImpl implements loginService {

    @Resource
    private loginDao loginDao;

    public boolean login(String name, String pwd){
         List<login> logins = loginDao.loginCheck();//数据库获得的账号密码 注意这里是返回list 并且Dao层不需要参数
        //前端传过来的数据到Service层使用即可
        for(login login:logins){
            //遍历数据库返回的列表 看看前端传过来的账号密码 是否与之一一对应
            if (login.getName().equals(name) && login.getPwd().equals(DigestUtils.md5Hex(pwd))){
                return true;
            }
        }
        return false;
    }

    @Override
    public long getUserId(String username) {
        return loginDao.GetUserId(username);
    }

    @Override
    public long GetAdmin(long id) {
        return loginDao.GetAdmin(id);
    }

}
