package com.user.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/**
 * 
 * @author Gaurav
 *
 */
@EnableJpaAuditing
@EnableJpaRepositories(basePackages= {"com.user.*"})
@ComponentScan(basePackages= {"com.user.*"})
@EntityScan("com.user.*")  
@SpringBootApplication
public class SpringMysqlRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlRestDemoApplication.class, args);
	}

}
