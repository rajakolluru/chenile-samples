package org.chenile.samples.secservice.configuration.controller;

import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;
import org.chenile.base.response.GenericResponse;
import org.chenile.http.annotation.InterceptedBy;
import org.chenile.samples.secservice.model.SecserviceEntity;
import org.chenile.http.annotation.ChenileController;
import org.chenile.http.handler.ControllerSupport;
import org.chenile.samples.security.SecurityConfig;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ChenileController(value = "secserviceService", serviceName = "_secserviceService_",
		healthCheckerName = "secserviceHealthChecker")
public class SecserviceController extends ControllerSupport{
	
	@PostMapping("/secservice/op1")
	@InterceptedBy("securityInterceptor")
	@SecurityConfig("my_role")
	public ResponseEntity<GenericResponse<SecserviceEntity>> op1(
			HttpServletRequest httpServletRequest,
			@RequestBody SecserviceEntity entity){
		return process("op1",httpServletRequest,entity);	
	}

}
