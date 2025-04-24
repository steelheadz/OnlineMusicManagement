package com.wll;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @time 2025/4/24 16:27 周四
 */
@SpringBootApplication
@MapperScan("com.wll.mapper")
public class OnlineMusicManagement {
    public static void main(String[] args) {
        SpringApplication.run(OnlineMusicManagement.class, args);
    }
}
