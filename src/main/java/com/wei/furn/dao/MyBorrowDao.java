package com.wei.furn.dao;

import com.wei.furn.bean.Myborrow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyBorrowDao {

    public List<Myborrow> getMyborrowDao(int id);

}
