package com.xd.utest;
import org.jeasy.random.annotation.Randomizer;

import java.time.LocalDateTime;
import java.util.Date;

class Person {
    @Randomizer(NameRandomizer.class)
    private String name;

    private int age;

    private String hobby;

    private LocalDateTime birthday;

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}