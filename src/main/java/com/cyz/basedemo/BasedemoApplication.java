package com.cyz.basedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cyz.basedemo.mapper")
public class BasedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasedemoApplication.class, args);

    }

}
