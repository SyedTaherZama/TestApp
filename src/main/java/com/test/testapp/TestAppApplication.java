package com.test.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestAppApplication {

    public static void main(String[] args) {
        System.out.println("Test");
        SpringApplication.run(TestAppApplication.class, args);
    }

}
