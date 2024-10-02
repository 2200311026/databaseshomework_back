package com.wei.furn.dao;

import com.wei.furn.bean.Register;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterDao {

    public void insertUser(Register register);

}
