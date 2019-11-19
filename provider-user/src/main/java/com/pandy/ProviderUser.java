package com.pandy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient//启用eureka客户端
@EnableDiscoveryClient
public class ProviderUser
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProviderUser.class);
    }
}
