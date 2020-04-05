package com.victolee.board_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BoardSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoardSpringBootApplication.class, args);
    }

}
