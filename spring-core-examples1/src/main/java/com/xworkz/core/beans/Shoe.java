package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Shoe {

    private double size;
    private String brand;
    private int price;
}
