package com.farmatodo.technical.domain.model;

import java.util.List;

public class HappyNumber {

    private List<Number> numbers;

    public HappyNumber() {
    }

    public HappyNumber(List<Number> numbers) {
        this.numbers = numbers;
    }

    public List<Number> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }
}
