package com.mymall.easymall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mymall.easymall.product.dao")
public class EasymallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasymallProductApplication.class, args);
    }

}
