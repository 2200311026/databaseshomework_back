package com.wei.furn.dao;

import com.wei.furn.bean.adminRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface adminRequestDao {
    public List<adminRequest> adminRequestdao();
}
