package com.doudou.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Doudou
 * @date 2022/4/5 - 22:43
 */
@SpringBootApplication
@MapperScan("com.doudou.hospital.mapper")
public class ServiceHosp8201Application {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHosp8201Application.class, args);
    }
}
