package org.chenile.samples.secservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.chenile.samples.secservice.service.SecserviceService;
import org.chenile.samples.secservice.service.impl.SecserviceServiceImpl;
import org.chenile.samples.secservice.service.healthcheck.SecserviceHealthChecker;

/**
 This is where you will instantiate all the required classes in Spring

*/
@Configuration
public class SecserviceConfiguration {
	@Bean public SecserviceService _secserviceService_() {
		return new SecserviceServiceImpl();
	}

	@Bean SecserviceHealthChecker secserviceHealthChecker(){
    	return new SecserviceHealthChecker();
    }
}
