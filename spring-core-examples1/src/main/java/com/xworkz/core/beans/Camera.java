package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Camera {
    private int id;
    private String company;
    private String model;
    private int price;
}
