package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Iron {
    private int id;
    private String weight;
    private int strength;
}
