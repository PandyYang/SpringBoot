package com.pandy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerOrder
{
    @Bean//相当于xml中的bean直接主要是调用当前的方法获取到指定的对象
    public RestTemplate getTemp(){
        return new RestTemplate();
    }
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerOrder.class);
    }
}
