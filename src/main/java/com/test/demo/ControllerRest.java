package com.test.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.domein.Individual;

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
        Individual individual = new Individual();
        individual.setName("Anthony");
        individual.setLastName("Rubio");
        individual.setEmail("hello@example.com");
        individual.setPhoneNumber("318 5 451 1");
        individual.setAge("24");

        log.info("prueba dev pro");
        model.addAttribute("hello",hello);
        model.addAttribute("hello2", hello2);
        model.addAttribute("individual", individual);
        return "indice";
    }
}