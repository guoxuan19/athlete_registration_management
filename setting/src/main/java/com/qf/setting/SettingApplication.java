package com.qf.setting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.qf"})
public class SettingApplication {
    public static void main(String[] args) {
        SpringApplication.run(SettingApplication.class,args);
    }
}
