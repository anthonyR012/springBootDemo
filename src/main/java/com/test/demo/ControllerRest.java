package com.test.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.domein.Individual;
import java.util.ArrayList;
import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControllerRest {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        Individual individual = new Individual();
        individual.setName("Anderson");
        individual.setLastName("Rubio");
        individual.setEmail("hello@example.com");
        individual.setPhoneNumber("318 5 451 1");
        individual.setAge("26");

        Individual individual2 = new Individual();
        individual2.setName("Carlos");
        individual2.setLastName("Albertto");
        individual2.setEmail("car@example.com");
        individual2.setPhoneNumber("318 5 451 1");
        individual2.setAge("26");

        ArrayList<Individual> individuals = new ArrayList<Individual>();
        // individuals.add(individual);
        // individuals.add(individual2);

        log.info("============TEST DEV RUN=============");
        model.addAttribute("individual", individual);
        model.addAttribute("individuals", individuals);

        return "indice";
    }
}