package com.yi.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Project Name: learn-spring-cloud
 * File Name: StudentConsumer_80
 * Package Name: com.yi.consumer
 *
 * @author yipple
 * @date 2020/5/27
 * @since 0.0.1
 */
@SpringBootApplication
@EnableEurekaClient
public class StudentConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(StudentConsumer_80.class, args);
    }
}
