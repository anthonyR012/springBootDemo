package com.test.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControllerRest {
    @Value("${indice.hello2}")
    private String hello2;

    @GetMapping("/hello")
    public String sayHello(Model model) {
        String hello = "Hello world!";
        log.info("prueba dev pro");
        model.addAttribute("hello",hello);
        model.addAttribute("hello2", hello2);
        return "indice";
    }
}