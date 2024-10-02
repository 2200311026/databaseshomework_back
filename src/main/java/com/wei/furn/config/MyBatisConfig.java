package com.wei.furn.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 常规配置 Mybatis 和 dao 关联
 */
@Configuration
@MapperScan({"com.wei.furn.dao"})
public class MyBatisConfig {
}
