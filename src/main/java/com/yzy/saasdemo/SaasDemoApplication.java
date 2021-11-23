package com.yzy.saasdemo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.yzy.saasdemo.*.dao")
public class SaasDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SaasDemoApplication.class, args);
    }

}
