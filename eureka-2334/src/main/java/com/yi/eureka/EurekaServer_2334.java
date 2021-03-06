package com.yi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Project Name: learn-spring-cloud
 * File Name: EurekaServer_2334
 * Package Name: com.yi.eureka
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_2334 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_2334.class, args);
    }
}
