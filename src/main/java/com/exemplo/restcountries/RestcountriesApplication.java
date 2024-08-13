package com.exemplo.restcountries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestcountriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestcountriesApplication.class, args);
	}

}
//http://localhost:8080/api/country/brazil/idd