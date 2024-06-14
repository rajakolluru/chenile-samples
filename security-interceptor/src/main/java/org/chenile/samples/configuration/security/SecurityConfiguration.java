package org.chenile.samples.configuration.security;


import jakarta.servlet.http.HttpServletRequest;
import org.chenile.samples.security.interceptor.SecurityInterceptor;
import org.keycloak.adapters.authorization.PolicyEnforcer;
import org.keycloak.adapters.authorization.integration.jakarta.ServletPolicyEnforcerFilter;
import org.keycloak.adapters.authorization.spi.ConfigurationResolver;
import org.keycloak.adapters.authorization.spi.HttpRequest;
import org.keycloak.representations.adapters.config.PolicyEnforcerConfig;
import org.keycloak.util.JsonSerialization;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.server.resource.web.authentication.BearerTokenAuthenticationFilter;
import org.springframework.security.web.SecurityFilterChain;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class SecurityConfiguration {

	@Value("${spring.security.oauth2.resourceserver.jwt.jwk-set-uri}")
	String jwkSetUri;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
			(authorize) -> authorize.anyRequest().authenticated())
			.oauth2Login(Customizer.withDefaults())
			.oauth2ResourceServer((oauth2) -> oauth2.jwt(Customizer.withDefaults()));
				//.oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
		// .addFilterAfter(createPolicyEnforcerFilter(), BearerTokenAuthenticationFilter.class);
		return http.build();
	}

	private ServletPolicyEnforcerFilter createPolicyEnforcerFilter() {
		PolicyEnforcerConfig config;
		try {
			config = JsonSerialization.readValue(getClass().getResourceAsStream("/policy-enforcer.json"), PolicyEnforcerConfig.class);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return new ServletPolicyEnforcerFilter(new ConfigurationResolver() {
			@Override
			public PolicyEnforcerConfig resolve(HttpRequest request) {
				return config;
			}
		});
	}

	@Bean public PolicyEnforcer policyEnforcerConfig() {
		PolicyEnforcerConfig config;
		try {
			config = JsonSerialization.readValue(getClass().getResourceAsStream("/policy-enforcer.json"), PolicyEnforcerConfig.class);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		String authServerUrl = config.getAuthServerUrl();
		return PolicyEnforcer.builder().authServerUrl(authServerUrl).realm(config.getRealm()).clientId(
				config.getResource()).credentials(config.getCredentials()).bearerOnly(false).
				enforcerConfig(config).build();
	}

	@Bean
	JwtDecoder jwtDecoder() {
		return NimbusJwtDecoder.withJwkSetUri(this.jwkSetUri).build();
	}

	@Bean
	public SecurityInterceptor securityInterceptor() {
		return new SecurityInterceptor();
	}
}
