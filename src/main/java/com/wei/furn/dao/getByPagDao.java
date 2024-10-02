package com.wei.furn.dao;

import com.github.pagehelper.Page;
import com.wei.furn.bean.book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface getByPagDao {
    Page<book> getbookByPag2();

}
