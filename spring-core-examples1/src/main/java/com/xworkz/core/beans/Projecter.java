package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Projecter {
    private int id;
    private String brand;
    private int price;
}
