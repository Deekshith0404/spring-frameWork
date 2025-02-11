package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Human {
    private String name;
    private int heightInCm;
    private String gender;
}
