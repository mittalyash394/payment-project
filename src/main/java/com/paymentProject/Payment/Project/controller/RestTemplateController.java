package com.paymentProject.Payment.Project.controller;

import com.paymentProject.Payment.Project.entity.CustomerProfile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class RestTemplateController {

    public static final Logger log = LogManager.getLogger(RestTemplateController.class);

    private final String ALL_CUSTOMERS = "http://localhost:8081/customer/allCustomers";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/v1/allCustomers")
    public ResponseEntity getAllCustomerProfiles() {
        log.info("Retrieving the all customerProfiles");
        CustomerProfile[] customerProfileArray = restTemplate.getForObject(ALL_CUSTOMERS, CustomerProfile[].class);
        return new ResponseEntity < > (Arrays.asList(customerProfileArray), HttpStatus.OK);
    }

}
