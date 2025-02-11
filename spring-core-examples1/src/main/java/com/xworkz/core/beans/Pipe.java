package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Pipe {
    private int id;
    private int length;
    private String company;
}
