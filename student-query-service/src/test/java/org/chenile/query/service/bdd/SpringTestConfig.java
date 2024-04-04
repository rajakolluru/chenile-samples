package org.chenile.query.service.bdd;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;

@Configuration
@SpringBootApplication(scanBasePackages = { "org.chenile.configuration"})
@ActiveProfiles("unittest")
public class SpringTestConfig extends SpringBootServletInitializer{
}

