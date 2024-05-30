package org.example.demofeignprogect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoFeignProgectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFeignProgectApplication.class, args);
    }

}
