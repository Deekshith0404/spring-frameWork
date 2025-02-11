package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cloths {
    private int id;
    private String brand;
    private int price;
    private int size;

}
