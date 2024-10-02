package com.wei.furn.dao;

import com.wei.furn.bean.Register;
import com.wei.furn.bean.Request;
import com.wei.furn.bean.book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class daoTest {

    @Resource
    private showBookDao showBookDao;



    @Test
    public void getShowBookDao() {

       List<book> books =showBookDao.showBook();

       for (book book : books) {
           System.out.println("book = " + book);
       }
    }

    @Resource
    RegisterDao registerDao;

    @Test
    public void RegisterDao() {

        Register register = new Register();
        register.setPwd("123");
        register.setName("weiaa");
        register.setEmail("weiaa@gmail.com");
        register.setMobile("123456789101");
        register.setGender(0);
        registerDao.insertUser(register);
    }

    @Resource
    private RequestDao requestDao;
    @Test
    public void RequestDao() {

        Request request = new Request();
        request.setId(2);
        request.setIsbn(2);
        request.setBorrowState(0);
        requestDao.RequestBorrow(request);
    }

    @Resource
    private loginDao loginDao;
    @Test
    public void setLoginDao() {
        System.out.println(loginDao.GetUserId("3ds"));
    }

    @Resource
    private MyBorrowDao myBorrowDao;
    @Test
    public void getmyBorrow() {
        System.out.println(myBorrowDao.getMyborrowDao(2));
    }

    @Resource
    private showBookDao showbookDao;
    @Test
    public void changeImg() {
        System.out.println("进来222");
      String img="http://localhost:9090/8415af57-249f-49ea-b050-9afc99d38a47猥琐猫.jpg";
        long isbn=1;
        showbookDao.changeImg(img, isbn);
    }
}
