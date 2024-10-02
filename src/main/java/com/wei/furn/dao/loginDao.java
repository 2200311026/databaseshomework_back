package com.wei.furn.dao;

import com.wei.furn.bean.login;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface loginDao {

    public List<login> loginCheck();

    public long GetUserId(String name);

    public long GetAdmin(long id);

}
