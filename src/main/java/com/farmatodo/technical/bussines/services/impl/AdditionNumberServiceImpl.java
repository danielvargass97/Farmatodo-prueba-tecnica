package com.farmatodo.technical.bussines.services.impl;

import com.farmatodo.technical.bussines.services.AdditionNumberService;
import com.farmatodo.technical.domain.model.Result;
import org.springframework.stereotype.Service;

@Service
public class AdditionNumberServiceImpl implements AdditionNumberService {
    @Override
    public Result sumNumbersSinceOneToN(int n) {
        return new Result((n * (n + 1)) / 2);
    }
}
