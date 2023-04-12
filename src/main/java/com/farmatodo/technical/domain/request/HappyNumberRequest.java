package com.farmatodo.technical.domain.request;

import java.util.List;

public class HappyNumberRequest {

    private List<Integer> numbers;

    public HappyNumberRequest() {
    }

    public HappyNumberRequest(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
