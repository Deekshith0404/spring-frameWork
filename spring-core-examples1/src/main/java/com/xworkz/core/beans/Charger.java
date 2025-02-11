package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class Charger {
    private int id;
    private int price;
    private String watt;
    private String brand;

}
