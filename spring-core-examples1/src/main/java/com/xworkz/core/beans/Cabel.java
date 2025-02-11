package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cabel {
    private int id;
    private String company;
    private int length;
}
