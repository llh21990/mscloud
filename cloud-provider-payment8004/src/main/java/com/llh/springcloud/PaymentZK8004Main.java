package com.llh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentZK8004Main {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZK8004Main.class, args);
    }
}
