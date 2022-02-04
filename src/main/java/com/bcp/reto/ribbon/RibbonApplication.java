package com.bcp.reto.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name="servicio-tipocambio")
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}

}
