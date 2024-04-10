package org.chenile.samples.issue;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;

import org.chenile.utils.entity.service.EntityStore;
import org.chenile.samples.issue.bdd.store.DummyIssueEntityStore;
import org.chenile.samples.issue.model.Issue;


@Configuration
@PropertySource("classpath:org/chenile/samples/issue/TestService.properties")
@SpringBootApplication(scanBasePackages = { "org.chenile.configuration", "org.chenile.samples.issue.configuration" })
@ActiveProfiles("unittest")
public class SpringTestConfig extends SpringBootServletInitializer{
	// Instantiate the fake store for unit testing purposes only
	@Bean @Profile("unittest") EntityStore<Issue> issueEntityStore() {
		return new DummyIssueEntityStore();
	}
	
}

