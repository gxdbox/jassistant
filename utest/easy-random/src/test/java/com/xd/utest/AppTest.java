package com.xd.utest;

import org.assertj.core.api.Assertions;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import org.jeasy.random.FieldPredicates;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

import static java.nio.charset.Charset.forName;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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
    public void test() {
        EasyRandom easyRandom = new EasyRandom(parameters);
        Person person = easyRandom.nextObject(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getHobby());
        System.out.println(person.getBirthday());
    }
}
