package com.wei.furn.Service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wei.furn.Service.getbookByPag2Service;
import com.wei.furn.bean.book;
import com.wei.furn.dao.getByPagDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class getbookByPag2ServiceImpl implements getbookByPag2Service {
    /**
     * 根据分页获取员工列表
     * @return 员工列表
     */
    @Resource
    private getByPagDao getByPagdao;

    @Override
    public List<book> getbookByPag2(int pageNum,int pageSize) {
        // 使用PageHelper插件设置分页参数，获取第1页，每页10条记录
        PageHelper.startPage(pageNum,pageSize);
        // 调用getByPagDao的getEmployeesByPag2方法获取分页结果
        Page<book> res= getByPagdao.getbookByPag2();
        // 从分页结果中获取图书列表
        List<book> result = res.getResult();
        // 获取总记录数
        long total = res.getTotal();
        // 返回图书列表
        return result;
    }

}
