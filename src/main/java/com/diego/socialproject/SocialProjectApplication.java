package com.diego.socialproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication()
public class SocialProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialProjectApplication.class, args);
	}

}
