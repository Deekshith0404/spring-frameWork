package com.xworkz.dInjection.politician;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("newcountry")
public class Country {
    @Value("6")
    private int id;
    @Value("england")
    private String name;
    @Value("29")
    private int noOfStates;
    @Value("140000000")
    private int population;
}
