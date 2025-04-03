package com.example.social_network.controllers;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ModelAndView handleValidationException(ConstraintViolationException ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");

        StringBuilder errorMessage = new StringBuilder();
        for (ConstraintViolation<?> violation : ex.getConstraintViolations()) {
            errorMessage.append(violation.getMessage()).append(". ");
        }

        modelAndView.addObject("error", errorMessage.toString());
        return modelAndView;
    }
}
