package org.chenile.samples.issue.configuration.controller;

import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;

import org.chenile.base.response.GenericResponse;
import org.chenile.http.annotation.BodyTypeSelector;
import org.chenile.http.annotation.ChenileController;
import org.chenile.http.annotation.ChenileParamType;
import org.chenile.http.handler.ControllerSupport;
import org.springframework.http.ResponseEntity;

import org.chenile.workflow.model.AbstractStateEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.chenile.workflow.dto.StateEntityServiceResponse;
import org.chenile.samples.issue.model.Issue;

@RestController
@ChenileController(value = "issueService", serviceName = "_issueStateEntityService_",
		healthCheckerName = "issueHealthChecker")
public class IssueController extends ControllerSupport{
	
	@GetMapping("/issue/{id}")
	public ResponseEntity<GenericResponse<StateEntityServiceResponse>> retrieve(
			HttpServletRequest httpServletRequest,
			@PathVariable String id){
		return process("retrieve",httpServletRequest,id);	
	}

	@PostMapping("/issue")
	public ResponseEntity<GenericResponse<StateEntityServiceResponse>> create(
			HttpServletRequest httpServletRequest,
			@ChenileParamType(AbstractStateEntity.class)
			@RequestBody Issue entity){
		return process("create",httpServletRequest,entity);	
	}

	
	@PutMapping("/issue/{id}/{eventID}")
	@BodyTypeSelector("issueBodyTypeSelector")
	public ResponseEntity<GenericResponse<StateEntityServiceResponse>> processById(
			HttpServletRequest httpServletRequest,
			@PathVariable String id,
			@PathVariable String eventID,
			@ChenileParamType(Object.class) 
			@RequestBody String eventPayload){
		return process("processById",httpServletRequest,id,eventID,eventPayload);	
	}


}
