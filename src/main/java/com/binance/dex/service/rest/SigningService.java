package com.binance.dex.service.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SigningService {
    
    private static final Logger log = LoggerFactory.getLogger(SigningService.class);

    @RequestMapping("/")
    public String index() {
        log.info("index requested");
        return "VAT Service request /highest or /lowest";
    }
}
