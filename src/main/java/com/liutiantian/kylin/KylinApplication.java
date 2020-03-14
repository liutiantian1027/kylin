package com.liutiantian.kylin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.liutiantian.kylin.mapper")
@EnableTransactionManagement
public class KylinApplication {

    public static void main(String[] args) {

        SpringApplication.run(KylinApplication.class, args);
    }

}
