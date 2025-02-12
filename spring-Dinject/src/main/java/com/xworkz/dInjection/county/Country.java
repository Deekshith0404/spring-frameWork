package com.xworkz.dInjection.county;

//import com.xworkz.dInjection.politician.Politician;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
@Data
@Component("oldcountry")
public class Country {
    @Value("1")
    private int id;
    @Value("India")
    private String name;
    @Value("29")
    private int noOfStates;
    @Value("140000000")
    private int population;
//    @Autowired
//    private Politician politician;
}
