package com.wei.furn.config;

import com.alibaba.druid.pool.DruidDataSource;
import jdk.nashorn.internal.ir.CallNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//配置类引入德鲁伊注入ioc 仅仅只有依赖是不足够的还需要在配置类中配置才能实现使用Druid数据源
@Configuration
@Slf4j
public class DruidDataSourceConfig {

    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        log.info("数据源={}",druidDataSource.getClass());
        return druidDataSource;
    }
}
