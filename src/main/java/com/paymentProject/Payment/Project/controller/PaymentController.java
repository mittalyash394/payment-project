package com.paymentProject.Payment.Project.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    public static final Logger log = LogManager.getLogger(PaymentController.class);

    @Value("${spring.application.name}")
    String applicationName;

    @GetMapping("/root")
    public String home(){
        log.info("This is a home root method");
        return "This is a home URL of " + applicationName;
    }

}
