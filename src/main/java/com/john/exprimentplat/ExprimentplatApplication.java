package com.john.exprimentplat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

@MapperScan(value = "com.john.exprimentplat.mapper")
public class ExprimentplatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExprimentplatApplication.class, args);
    }

}
