package org.chenile.samples.issue.bdd;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.chenile.samples.issue.SpringTestConfig;

import cucumber.api.java.en.Given;

/**
 * Dummy steps class to point to Spring configuration.
 * 
 *
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT,classes = SpringTestConfig.class)
@AutoConfigureMockMvc
@ActiveProfiles("unittest")
public class CukesSteps {
	@Given("dummy") public void dummy(){}
}
