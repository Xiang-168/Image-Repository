package com.hzx.photorepository;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.hzx.photorepository.mapper")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class PhotoRepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoRepositoryApplication.class, args);
    }

}
