package com.farmatodo.technical.domain.model;

public class Number {

    private int number;
    private boolean isHappy;

    public Number() {
    }

    public Number(int number, boolean isHappy) {
        this.number = number;
        this.isHappy = isHappy;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }
}
