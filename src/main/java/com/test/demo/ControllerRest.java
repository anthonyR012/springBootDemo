package com.test.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ControllerRest {
    @GetMapping("/hello")
    public String sayHello() {
        log.info("prueba dev pro");
        return "Hello dev pro";
    }
}