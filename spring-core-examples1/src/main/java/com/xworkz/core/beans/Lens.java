package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Lens {
    private int id;
    private String company;
    private int price;
}
