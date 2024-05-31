package com.github.danyeu.application;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Random;

@Service
public class RandomService {
    public HashMap<String, Integer> getRandomNumber() {
        Random rand = new Random();
        int i = rand.nextInt(0, 1000000);
        HashMap<String, Integer> m = new HashMap<>();
        m.put("number", i);
        return m;
    }
}