package com.example.accounts.controllers;

import com.example.accounts.dto.CustomerDetailsDto;
import com.example.accounts.service.ICustomerService;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@Validated
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private final ICustomerService iCustomerService;

    @GetMapping("/fetchCustomerDetails")
    public ResponseEntity<CustomerDetailsDto> fetchCustomerDetails(
            @RequestHeader("eazyBank-correlation-id") String correlationId,
            @RequestParam
            @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile not valid") String mobileNumber
    ) {
        logger.debug("eazyBank-correlation-id found: {}", correlationId);
        CustomerDetailsDto customerDetailsDto = iCustomerService.fetchCustomerDetails(mobileNumber, correlationId);
        return ResponseEntity.status(HttpStatus.OK).body(customerDetailsDto);
    }


}
