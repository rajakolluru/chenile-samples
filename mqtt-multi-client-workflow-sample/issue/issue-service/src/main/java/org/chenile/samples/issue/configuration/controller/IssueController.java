package org.chenile.samples.issue.configuration.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.chenile.base.response.GenericResponse;
import org.chenile.http.annotation.BodyTypeSelector;
import org.chenile.http.annotation.ChenileController;
import org.chenile.http.annotation.ChenileParamType;
import org.chenile.http.handler.ControllerSupport;
import org.chenile.samples.issue.model.Issue;
import org.chenile.stm.StateEntity;
import org.chenile.workflow.dto.StateEntityServiceResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ChenileController(value = "issueService", serviceName = "_issueStateEntityService_",
		healthCheckerName = "issueHealthChecker")
public class IssueController extends ControllerSupport{
	
	@GetMapping("/issue/{id}")
	public ResponseEntity<GenericResponse<StateEntityServiceResponse<Issue>>> retrieve(
			HttpServletRequest httpServletRequest,
			@PathVariable String id){
		return process("retrieve",httpServletRequest,id);	
	}

	@PostMapping("/issue")
	public ResponseEntity<GenericResponse<StateEntityServiceResponse<Issue>>> create(
			HttpServletRequest httpServletRequest,
			@ChenileParamType(StateEntity.class)
			@RequestBody Issue entity){
		return process("create",httpServletRequest,entity);	
	}

	
	@PutMapping("/issue/{id}/{eventID}")
	@BodyTypeSelector("issueBodyTypeSelector")
	public ResponseEntity<GenericResponse<StateEntityServiceResponse<Issue>>> processById(
			HttpServletRequest httpServletRequest,
			@PathVariable String id,
			@PathVariable String eventID,
			@ChenileParamType(Object.class) 
			@RequestBody String eventPayload){
		return process("processById",httpServletRequest,id,eventID,eventPayload);	
	}


}
