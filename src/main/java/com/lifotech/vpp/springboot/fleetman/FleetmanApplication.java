package com.lifotech.vpp.springboot.fleetman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.lifotech.vpp.springboot.fleetma.domain")
@EnableJpaRepositories("com.lifotech.vpp.springboot.fleetma.data")
public class FleetmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetmanApplication.class, args);
	}
}
