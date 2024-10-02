package com.wei.furn.Service.impl;


import com.wei.furn.Service.showBookService;
import com.wei.furn.bean.book;
import com.wei.furn.dao.showBookDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class showBookServiceImpl implements showBookService {

    @Resource
    private showBookDao showBookdao;

    @Override
    public List<book> showBook() {
        List<book> books = showBookdao.showBook();
        return books;
    }

    @Override
    public void addBook(book book) {
        showBookdao.addBook(book);
    }

    @Override
    public void changeBookInfo(book book) {
        showBookdao.changeBookInfo(book);
    }

    @Override
    public void lastNumsSub(long isbn) {
        showBookdao.lastNumsSub(isbn);//通过isbn减少对应图书数量 因为isbn是书本唯一标识
    }

    @Override
    public void lastNumsAdd(long isbn) {
        showBookdao.lastNumsAdd(isbn);
    }

    @Override
    public long getBorrow(long isbn) {
       return showBookdao.getBorrow(isbn);
    }

    @Override
    public void deleteBook(long isbn) {
        showBookdao.deleteBook(isbn);
    }

    @Override
    public long booksNums() {
       return showBookdao.booksNums();
    }

    @Override
    public List<book> selectBooksByName(String bookName) {
        return showBookdao.selectBooksByName(bookName);
    }

    @Override
    public void changeImg(String img, long isbn) {
        System.out.println("进来111");
        showBookdao.changeImg(img, isbn);
    }

    @Override
    public String getBookName(long isbn) {
       return showBookdao.getBookName(isbn);
    }

}
