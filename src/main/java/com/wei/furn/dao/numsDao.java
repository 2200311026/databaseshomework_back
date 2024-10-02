package com.wei.furn.dao;

import com.wei.furn.bean.nums;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface numsDao {
    public nums getNums(long isbn);
}
