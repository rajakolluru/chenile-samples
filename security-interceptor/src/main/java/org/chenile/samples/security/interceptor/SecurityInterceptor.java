package org.chenile.samples.security.interceptor;

import org.chenile.core.context.ChenileExchange;
import org.chenile.core.interceptors.BaseChenileInterceptor;
import org.keycloak.adapters.authorization.PolicyEnforcer;
import org.keycloak.representations.adapters.config.PolicyEnforcerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.chenile.samples.security.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;

/**
 * 
 * A custom interceptor. 
 * This uses a customized annotation that contains all the configurtion required
 *
 */
public class SecurityInterceptor extends BaseChenileInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(SecurityInterceptor.class);

	@Autowired
	PolicyEnforcer policyEnforcer;
	@Override
	protected void doPreProcessing(ChenileExchange exchange) {
        SecurityConfig config = getExtensionByAnnotation(SecurityConfig.class, exchange);
		logger.debug("At logger (pre-processor): value is " + config.value());
		exchange.setHeader("security-interceptor-preprocessheader", config.value());
		exchange.getHeaders().forEach((k,v)->{
			if (!k.equalsIgnoreCase("org.springframework.core.convert.ConversionService") && !k.equalsIgnoreCase("authorization")){
				System.out.println(k + ":" + v);
			}
		});
		// System.out.println("Authentication: " + exchange.getHeaders());

		// as a test we will obtain the value of the 
		// do something with the config 
		// use exchange.getBody() to access the payload if this interceptor is intended to be a payload processor
		// else use exchange.getHeader("name") to access specific headers
        /*
        Some example code for throwing an error.
        throw new ServerException(ErrorCodes.SOME_ERROR,new Object[] {});
        */
	}

	@Override
	protected void doPostProcessing(ChenileExchange exchange) {
        SecurityConfig config = getExtensionByAnnotation(SecurityConfig.class, exchange);
		logger.debug("At logger (post-processor): value is " + config.value());
		exchange.setHeader("security-interceptor-postprocessheader", config.value());
		// do something with the config 
		// use exchange.getResponse() to access the response
		// use exchange.getException() to access the response
	}	

	// Use this method to bypass the interceptor if there exists no configuration
	@Override
	protected boolean bypassInterception(ChenileExchange exchange) {
		SecurityConfig config = getExtensionByAnnotation(SecurityConfig.class, exchange);
		if(config == null)return true;
		return false;
	}
}
