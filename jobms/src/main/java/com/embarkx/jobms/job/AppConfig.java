package com.embarkx.jobms.job;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//if we are using restTemplate for synchronous communication to be able to work with Eureka,
//we need load balanced version of restTemplate to discover service names from registered in Eureka.
//Not needed if we use Feign clients
@Configuration
public class AppConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
