package com.wei.furn.dao;

import com.wei.furn.bean.userr;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userInfoDao {
    userr getUserInfo(long id);
    void changeUserInfo(userr user);
    String getUserPassword(long id);
    void updatePassword(long id, String newpwd);
    String getName(long id);
    long getMoney(long id);
    void addMoney(long id, long money);
    Integer allPenalty(long id);
}
