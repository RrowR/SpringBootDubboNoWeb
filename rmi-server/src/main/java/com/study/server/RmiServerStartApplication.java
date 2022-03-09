package com.study.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Rrow
 * @date: 2022/3/9 23:12
 */
@SpringBootApplication
public class RmiServerStartApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(RmiServerStartApplication.class,args);
        Thread.currentThread().join();
    }
}
