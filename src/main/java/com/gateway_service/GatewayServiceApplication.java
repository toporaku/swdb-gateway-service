package com.gateway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// @spec INFRA-GW-001, INFRA-GW-002, INFRA-GW-003, INFRA-GW-004, INFRA-GW-005, INFRA-GW-006, INFRA-GW-007, INFRA-GW-008, INFRA-GW-009
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

}
