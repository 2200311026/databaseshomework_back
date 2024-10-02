package com.wei.furn.service;

import com.wei.furn.Service.MyborrowService;
import com.wei.furn.Service.RegisterService;
import com.wei.furn.Service.loginService;
import com.wei.furn.Service.showBookService;
import com.wei.furn.bean.Register;
import com.wei.furn.bean.book;
import com.wei.furn.bean.login;
import com.wei.furn.dao.loginDao;
import com.wei.furn.dao.showBookDao;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class serviceTest {

    @Resource
    private showBookDao showBookDao;

    @Resource
    private loginDao loginDao;

    @Test
    public void showBook() {
        List<book> books = showBookDao.showBook();
        for (book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void login() {

        List<com.wei.furn.bean.login> logins = loginDao.loginCheck();//数据库获得的账号密码 注意这里是返回list 并且Dao层不需要参数
        //前端传过来的数据到Service层使用即可
        for (login login : logins) {
            //遍历数据库返回的列表 看看前端传过来的账号密码 是否与之一一对应
            System.out.println(login);
            System.out.println(DigestUtils.md5Hex("123"));//正版密码
            if (login.getName().equals("smith") && login.getPwd().equals(DigestUtils.md5Hex("123"))) {
                System.out.println("yes");
                return;
            }
        }
        System.out.println("nonono");

    }

    @Resource
    private RegisterService registerService;
    @Test
 public  void TestRegisterService()
    {
        Register register = new Register();
        register.setPwd("123");
        register.setName("weibb");
        register.setMobile("123456789101");
        register.setEmail("weiaa@gmail.com");
        register.setGender(0);

        registerService.register(register);
    }

    @Resource
    private loginService loginService;
    @Test
    public  void loginServiceTest()
    {
        System.out.println(loginService.getUserId("3ds"));
    }

    @Resource
    private MyborrowService myborrowService;
    @Test
    public  void MyborrowServiceTest()
    {
        System.out.println(myborrowService.getMyborrow(2));
    }

    @Resource
    private showBookService showBookService;
    @Test
    public void test123(){
        showBookService.changeImg("http://localhost:9090/8415af57-249f-49ea-b050-9afc99d38a47哐当猫.jpg",1);
    }

}






