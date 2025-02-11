package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Mobile {
    private int id;
    private String brandName;
    private int price;
    private String model;
}
