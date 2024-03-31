package com.xd.utest;

import org.jeasy.random.EasyRandomParameters;

import java.time.LocalDate;
import java.time.LocalTime;

import static java.nio.charset.Charset.forName;

public class EasyRandomParametersFactory {

    public static EasyRandomParameters getEasyRandomParameters() {
        LocalTime nine = LocalTime.of(9, 0);
        LocalTime five = LocalTime.of(17, 0);
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);

        EasyRandomParameters parameters = new EasyRandomParameters().seed(123L)
                .objectPoolSize(100)
                .randomizationDepth(3)
                .charset(forName("UTF-8"))
                .timeRange(nine, five)
                .dateRange(today, tomorrow)
                .stringLengthRange(2, 20)
                .collectionSizeRange(1, 10)
                .scanClasspathForConcreteTypes(true)
                .overrideDefaultInitialization(false)
                .ignoreRandomizationErrors(true)
                .bypassSetters(true);
        return parameters;
    }
}
