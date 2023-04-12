package com.farmatodo.technical.bussines.services.impl;

import com.farmatodo.technical.bussines.services.HappyNumberService;
import com.farmatodo.technical.domain.model.HappyNumber;
import com.farmatodo.technical.domain.model.Number;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class HappyNumbersServiceImpl implements HappyNumberService {
    @Override
    public HappyNumber getHappyNumbersByList(List<Integer> numbers) {
        List<Number> happyNumbers = new ArrayList<>();
        for (Integer n : numbers) {
            happyNumbers.add(new Number(n, isHappyNumber(n)));
        }
        return new HappyNumber(happyNumbers);
    }

    private static boolean isHappyNumber(int n) {
        Set<Integer> seen = new HashSet<>();
        while (!seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

}
