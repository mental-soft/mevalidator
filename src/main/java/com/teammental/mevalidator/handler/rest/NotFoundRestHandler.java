package com.teammental.mevalidator.handler.rest;

import com.teammental.mevalidator.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NotFoundRestHandler {

  private static final Logger LOGGER = LoggerFactory.getLogger(NotFoundException.class);

  @ExceptionHandler(NotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public void processHandler(NotFoundException ex) {
    LOGGER.error("NOT FOUND ERROR: " + ex.getMessage());
  }
}