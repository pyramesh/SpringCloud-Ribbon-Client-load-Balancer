package com.ramesh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

import com.ramesh.config.RibbonConfiguration;

@SpringBootApplication(scanBasePackages="com.ramesh.*")
@EnableAutoConfiguration
@EnableDiscoveryClient
@Configuration
@RibbonClient(name="server", configuration=RibbonConfiguration.class)
public class RibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonClientApplication.class, args);
	}

}

