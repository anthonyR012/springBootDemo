package com.test.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControllerRest {
    @GetMapping("/hello")
    public String sayHello() {
        log.info("prueba dev pro");
        return "indice";
    }
}