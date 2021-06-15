package com.tileworld.twb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class TwBApplication {


    public static void main(String[] args) {
        SpringApplication.run(TwBApplication.class, args);
    }

}
