package com.example.springsecurity.springsecurityconfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@EnableJpaRepositories(basePackages = "com.example.springsecurity")
//@EntityScan("com.example.springsecurityJPA")
//@SpringBootApplication(scanBasePackages = "com.example.springsecurity")
@SpringBootApplication
public class SpringSecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaApplication.class, args);
	}

}
