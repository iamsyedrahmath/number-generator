package com.number.generator.numbergenerator.services;

import com.number.generator.numbergenerator.response.NumberApiResponse;

public interface NumberService {

    NumberApiResponse generateOrderNumber(String marketCode);
}
