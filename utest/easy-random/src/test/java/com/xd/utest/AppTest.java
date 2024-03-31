package com.xd.utest;


import org.assertj.core.api.Assertions;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Unit test for simple App.
 */
public class AppTest {

    EasyRandomParameters parameters;

    @Before
    public void setup() {
        parameters = EasyRandomParametersFactory.getEasyRandomParameters();
    }

    @org.junit.Test
    public void testSortAlgo() {
        // given
        Person person = new EasyRandom().nextObject(Person.class);
        System.out.println(person.getName());
    }

    @Test
    public void testRandomAndEasyRandom() {
        // given
        Random random = new Random(10L);
        EasyRandom easyRandom = new EasyRandom(new EasyRandomParameters().seed(10L));
        // when
        long long1 = random.nextLong();
        long long2 = easyRandom.nextLong();
        // then
        Assertions.assertThat(long1).isEqualTo(long2);
    }

    @Test
    public void custome_single_object() {
        EasyRandom easyRandom = new EasyRandom(parameters);
        Person person = easyRandom.nextObject(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getHobby());
        System.out.println(person.getBirthday());
    }

    @Test
    public void custome_mutil_levels() {
        EasyRandom easyRandom = new EasyRandom(parameters);
        Apple apple = easyRandom.nextObject(Apple.class);
        System.out.println(apple.getStringValue());
        System.out.println(apple.getIntValue());
        System.out.println(apple.getLocalDateValue());

        Banana banana = apple.getB();
        System.out.println(banana.getStringValue());
        System.out.println(banana.getIntValue());
        System.out.println(banana.getLocalDateValue());

        Cat cat = banana.getC();
        System.out.println(cat.getStringValue());
        System.out.println(cat.getIntValue());
        System.out.println(cat.getLocalDateValue());
    }
}
