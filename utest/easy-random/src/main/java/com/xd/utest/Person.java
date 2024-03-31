package com.xd.utest;
import org.jeasy.random.annotation.Randomizer;
class Person {
    @Randomizer(NameRandomizer.class)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}