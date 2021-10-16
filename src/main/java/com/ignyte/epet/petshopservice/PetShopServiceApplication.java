package com.ignyte.epet.petshopservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class PetShopServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetShopServiceApplication.class, args);
    }

}
