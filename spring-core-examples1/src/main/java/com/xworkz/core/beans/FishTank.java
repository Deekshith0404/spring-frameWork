package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class FishTank {
    private int id;
    private int numOfFish;
    private String species;
}
