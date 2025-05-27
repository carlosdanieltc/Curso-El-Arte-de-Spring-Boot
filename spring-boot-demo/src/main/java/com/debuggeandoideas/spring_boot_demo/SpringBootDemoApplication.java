package com.debuggeandoideas.spring_boot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.debuggeandoideas.spring_boot_demo.services.GauntletService;

@SpringBootApplication
@PropertySource("classpath:configs/stone.properties")
public class SpringBootDemoApplication implements CommandLineRunner{

	//DI, properties, configs and java methods
	//@Value(value = "#{T(java.lang.Math).random() * 100}")
	@Value("${server.port}")
	private String value;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(value);
	}

}
