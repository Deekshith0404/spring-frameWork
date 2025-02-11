package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class Locker {
    private String brand;
    private int price;
    private String strength;
}
