package com.wei.furn.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserImgDao {
    String getImgUrl(long id);
    void putImgUrl(long id, String img);
    Long ifsaveId(Long id);
    void insertId(long id, String img);
}
