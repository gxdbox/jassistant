package com.xd.utest;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NameRandomizer2 implements Randomizer2<String> {

    private List<String> names = Arrays.asList("John", "Brad", "Tommy");

    @Override
    public String getRandomValue() {
        return names.get(new Random().nextInt(2));
    }

}