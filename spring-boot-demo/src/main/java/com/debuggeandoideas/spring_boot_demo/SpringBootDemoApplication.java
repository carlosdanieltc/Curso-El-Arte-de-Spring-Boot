package com.debuggeandoideas.spring_boot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.debuggeandoideas.spring_boot_demo.components.ThanosComponent;
import com.debuggeandoideas.spring_boot_demo.models.Stone;
import com.debuggeandoideas.spring_boot_demo.services.GauntletService;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner{

	//DI, properties, configs and java methods
	//@Value(value = "#{T(java.lang.Math).random() * 100}")
	// @Value("${server.port}")
	// private String value;

	@Autowired
	private ThanosComponent thanos;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		thanos.snap();
	}

}
