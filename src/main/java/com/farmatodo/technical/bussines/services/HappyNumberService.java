package com.farmatodo.technical.bussines.services;

import com.farmatodo.technical.domain.model.HappyNumber;

import java.util.List;

public interface HappyNumberService {

    HappyNumber getHappyNumbersByList(List<Integer> numbers);
}
