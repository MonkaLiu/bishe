package com.hua.shi.rmd;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value = "com.hua.shi")
public class RmdApplication {

    public static void main(String[] args) {
        SpringApplication.run(RmdApplication.class, args);
    }
}
