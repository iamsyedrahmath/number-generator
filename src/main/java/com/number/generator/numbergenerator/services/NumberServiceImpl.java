package com.number.generator.numbergenerator.services;

import com.number.generator.numbergenerator.response.NumberApiResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class NumberServiceImpl implements NumberService{
    @Override
    public NumberApiResponse generateOrderNumber(String marketCode) {
        NumberApiResponse numberApiResponse = new NumberApiResponse();
        numberApiResponse.setMessage(generateString(marketCode));
        numberApiResponse.setStatus("200");
        return numberApiResponse;
    }
    private String generateString(String marketCode){
        String uuid = UUID.randomUUID().toString();
        return marketCode+uuid;
    }
}
