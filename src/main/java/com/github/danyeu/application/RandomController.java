package com.github.danyeu.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class RandomController {

    @Autowired
    private RandomService randomService;

    @GetMapping("/random")
    public HashMap<String, Integer> random() {
        return randomService.getRandomNumber();
    }

}
