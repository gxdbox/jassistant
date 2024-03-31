package com.xd.utest;

import org.jeasy.random.api.Randomizer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NameRandomizer implements Randomizer<String> {

    private List<String> names = Arrays.asList("John", "Brad", "Tommy");

    @Override
    public String getRandomValue() {
        return names.get(new Random().nextInt(2));
    }

}