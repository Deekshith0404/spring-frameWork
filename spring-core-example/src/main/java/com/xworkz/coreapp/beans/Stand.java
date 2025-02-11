package com.xworkz.coreapp.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Stand {
    private int id;
    private String productName;
    private double price;

}
