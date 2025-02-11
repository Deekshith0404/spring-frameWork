package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Fan {
    private int id;
    private String brand;
    private int price;
}
