package com.chenpp.ddd.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author April.Chen
 * @date 2023/8/30 6:40 下午
 **/
@SpringBootApplication(scanBasePackages = {"com.chenpp.ddd"})
public class DddApplication {

    public static void main(String[] args) {
        SpringApplication.run(DddApplication.class, args);
    }
}
