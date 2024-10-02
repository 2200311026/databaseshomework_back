package com.wei.furn.Service;

import com.wei.furn.bean.userr;
import org.springframework.stereotype.Service;

@Service
public interface getUserInfoService {
    userr getUserInfo(long id);
    void changeUserInfo(userr user);
    Boolean getUserPassword(long id,String oldPassword);
    Boolean updatePassword(long id,String newpwd);
    String getName(long id);
    long getMoney(long id);
    void addMoney(long id, long money);
    Integer allPenalty(long id);
}
