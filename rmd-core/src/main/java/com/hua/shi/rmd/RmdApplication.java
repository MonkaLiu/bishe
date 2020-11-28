package com.hua.shi.rmd;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2
@MapperScan("com.hua.shi.rmd.mapper")
public class RmdApplication {

    public static void main(String[] args) {
        SpringApplication.run(RmdApplication.class, args);
    }
}
