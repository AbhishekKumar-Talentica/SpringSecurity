package com.security.MySqlSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MySqlSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySqlSecurityApplication.class, args);
	}

}
