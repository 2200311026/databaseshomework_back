//package com.wei.furn;
//
//import com.wei.furn.Service.FurnService;
//import com.wei.furn.bean.Furn;
//import com.wei.furn.dao.FurnMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//@SpringBootTest
//public class ApplicationTest {
//
//    //mapper层测试
//    //装配mapper对象-是一个代理对象
//    @Resource
//    private FurnMapper furnMapper;
//    @Test
//    public void testFurnMapper(){
//        System.out.println("furnMapper--"+furnMapper.getClass());
//        Furn furn = furnMapper.selectById(4);
//        System.out.println("furn--"+furn);
//    }
//
//
//    //Service层测试
//    @Resource
//    private FurnService furnService;
//    @Test
//    public  void testFurnService(){
//        List<Furn> furns = furnService.list();
//        for(Furn furn:furns){
//            System.out.println("furn--"+furn);
//        }
//    }
//
//
//
//
//
//
//
//
//}
