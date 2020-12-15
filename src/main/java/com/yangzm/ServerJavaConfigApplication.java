package com.yangzm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerJavaConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerJavaConfigApplication.class, args);
    }
}
