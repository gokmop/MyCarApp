package com.mca.mycarapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EntityScan
public class MyCarAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCarAppApplication.class, args);
	}

}
