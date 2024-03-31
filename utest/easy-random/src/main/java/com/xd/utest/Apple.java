package com.xd.utest;

import java.time.LocalDate;

class Apple {
    private Banana banana;
    private String stringValue;
    private LocalDate localDateValue;
    private int intValue;

    public Banana getB() {
        return banana;
    }

    public void setB(Banana banana) {
        this.banana = banana;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public LocalDate getLocalDateValue() {
        return localDateValue;
    }

    public void setLocalDateValue(LocalDate localDateValue) {
        this.localDateValue = localDateValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}
