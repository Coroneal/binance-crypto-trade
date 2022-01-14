package com.crypto.binance.endpoints;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/api")
public class ExampleEndpoint {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String index() {
        log.info("Showing index page");
        return "Application is up and running.";
    }

    @GetMapping("/time")
    @ResponseStatus(HttpStatus.OK)
    public String getCurrentTime() {
        log.info("Showing current time");
        return LocalDateTime.now().toString();
    }
}