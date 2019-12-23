package com.example.shinyuarticle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.shinyuarticle.mapper")
public class ShinyuArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShinyuArticleApplication.class, args);
    }

}
