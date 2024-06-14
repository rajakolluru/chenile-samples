package org.chenile.samples.secservice.service.impl;

import org.chenile.base.exception.BadRequestException;
import org.chenile.base.exception.ErrorNumException;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.chenile.samples.secservice.model.SecserviceEntity;
import org.chenile.samples.secservice.service.SecserviceService;

public class SecserviceServiceImpl implements SecserviceService{
    private static final Logger logger = LoggerFactory.getLogger(SecserviceServiceImpl.class);
	@Override
	public SecserviceEntity op1(SecserviceEntity secserviceEntity) {
        logger.debug("At the op1 method in service class");
		// Implement the service here
		secserviceEntity.id = "SecserviceServiceImpl";
        /*
            Some example code for throwing an error.
            throw new ServerException(ErrorCodes.SOME_ERROR,new Object[] {});
        */
		return secserviceEntity;
	}
}