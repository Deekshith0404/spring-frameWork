package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Projecter {
    private int id;
    private String name;
    private int price;
}
