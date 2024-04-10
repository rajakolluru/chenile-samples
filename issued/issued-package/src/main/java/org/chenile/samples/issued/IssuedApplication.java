package org.chenile.samples.issued;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = { "org.chenile.samples.**.configuration",
		"org.chenile.configuration" })
public class IssuedApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(IssuedApplication.class, args);
	}
}
