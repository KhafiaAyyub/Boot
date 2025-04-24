package com.example.demo.Boot.Config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Boot.DB;
import com.example.demo.Boot.DevDB;
import com.example.demo.Boot.ProdDB;

@Configuration
public class AppConfig {
	
	@Bean
	@ConditionalOnProperty(name="project.mode", havingValue = "development")
	public DB getDevDBBBean() {
		return new DevDB();
	}
	
	@Bean
	@ConditionalOnProperty(name="project.mode", havingValue = "production")
	public DB getProdDBBBean() {
		return new ProdDB();
	}
	//ambiguity -  which bean - two beans are there
}
