package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ups {
    private int id;
    private String company;
    private int wats;
}
