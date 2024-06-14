package org.chenile.samples.security.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringConfig.class)
@ActiveProfiles("unittest")
@AutoConfigureMockMvc
public class TestSecurity {
	@Autowired private MockMvc mvc;
	@Test public void testSecurity() throws Exception {
		String token = "";
		InputStream is = getClass().getClassLoader().getResourceAsStream("token.txt");
		if (is != null){
			token = new String(is.readAllBytes(), StandardCharsets.UTF_8);
		}
		System.err.println("token is " + token);

		mvc.perform( MockMvcRequestBuilders
            .get("/test")
            .header("security-interceptor-preprocessheader","some_message")
        	.header("security-interceptor-postprocessheader","some_message")
			.header("Authorization", "Bearer " + token.strip())
			.accept(MediaType.APPLICATION_JSON))
        	.andDo(print())
        	.andExpect(status().isOk())
        	.andExpect(jsonPath("$.payload.test").value("test"));
	}
}
