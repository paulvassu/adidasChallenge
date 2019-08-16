package com.adidas.challenge.controllers;

import com.adidas.challenge.services.HardWorkingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
class GreetingController {

    private static final String template = "Hello, %s!";

    private final static Logger logger = LoggerFactory.getLogger(HardWorkingService.class);

    @Autowired
    private HardWorkingService lazyService;

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting(@RequestParam(value="name") String name) {


        if (name.isEmpty()){
            logger.info("No name - no greeting!");
            return ResponseEntity.badRequest().body("Please provide a name to greet");

        }

        lazyService.DoSomeIncreasinglyHardWork();

        logger.info("Greeting " + name );
        return ResponseEntity.ok().body(String.format(template, name));
    }
}