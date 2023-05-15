package com.back.creditobancario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class BackendCreditoBancarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendCreditoBancarioApplication.class, args);
    }

}
