package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class Watch {
    private int id;
    private String brand;
    private String model;
    private int price;
}
