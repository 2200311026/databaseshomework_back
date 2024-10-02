package com.wei.furn.Service;

import com.wei.furn.bean.book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface getbookByPag2Service {
    public List<book> getbookByPag2(int pageNum,int pageSize);
}
