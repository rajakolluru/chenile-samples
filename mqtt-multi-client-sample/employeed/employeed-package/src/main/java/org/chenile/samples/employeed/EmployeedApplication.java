package org.chenile.samples.employeed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = { "com.netscoretech.pos.**.configuration",
		"org.chenile.configuration" })
@EntityScan("com.netscoretech.pos.**.model")
@EnableJpaRepositories(basePackages = "com.netscoretech.pos.**.configuration.dao")
@EnableTransactionManagement
public class EmployeedApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EmployeedApplication.class, args);
	}
}
