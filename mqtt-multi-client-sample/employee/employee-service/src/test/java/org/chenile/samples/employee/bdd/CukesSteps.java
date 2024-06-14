package org.chenile.samples.employee.bdd;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.chenile.samples.employee.SpringTestConfig;

import cucumber.api.java.en.Given;


/**
 * Dummy steps for hooking up spring config
 *
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT,classes = SpringTestConfig.class)
@AutoConfigureMockMvc
@ActiveProfiles("unittest")
public class CukesSteps {
	
	@Given("dummy") public void dummy(){}
}
