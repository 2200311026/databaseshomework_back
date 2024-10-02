//package com.wei.furn.config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MybatisPlusConfig {
//    //注入MybatisPlusInterceptor 对象bean
//    //在MybatisPlusInterceptor bean中加入分页插件PaginationInnerInterceptor
//    @Bean
//    public MybatisPlusInterceptor interceptor(){
//        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        //这里分页要指定数据库类型 因为不同的数据库分页的sql语句不一样
//        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
//        return interceptor;
//    }
//}
