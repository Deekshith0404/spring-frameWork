package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Mobile {
    private int id;
    private String name;
    private int price;
}
