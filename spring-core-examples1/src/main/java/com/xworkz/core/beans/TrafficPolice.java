package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TrafficPolice {
    private String post;
    private String location;
    private int pincode;

}
