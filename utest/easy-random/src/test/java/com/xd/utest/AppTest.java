package com.xd.utest;

import org.assertj.core.api.Assertions;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
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
}
