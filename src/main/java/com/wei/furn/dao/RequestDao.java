package com.wei.furn.dao;

import com.wei.furn.bean.Request;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RequestDao {
    public void RequestBorrow(Request request);

    public void DeleteRequest(long requestId);

    public void updataBorrowState(long requestId);
}


