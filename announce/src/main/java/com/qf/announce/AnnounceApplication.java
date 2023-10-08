package com.qf.announce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.qf"})
public class AnnounceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AnnounceApplication.class,args);
    }
}
