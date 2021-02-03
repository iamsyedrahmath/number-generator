package com.number.generator.numbergenerator.controllers;

import com.number.generator.numbergenerator.response.NumberApiResponse;
import com.number.generator.numbergenerator.services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/numberapi/")
public class NumberController {

    @Autowired
    private NumberService numberService;

    @GetMapping("/generate/{marketCode}")
    public NumberApiResponse generateNumber(@PathVariable String marketCode){
        return numberService.generateOrderNumber(marketCode);
    }

}
