package com.xworkz.core.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Laptop {
    private int id;
    private String brandName;
    private int price;
    private String processor;
@Autowired
    public Laptop(@Value("1") int id, @Value("lenovo") String brandName,@Value("2500") int price,@Value("nvedia") String processor) {
        this.id = id;
        this.brandName = brandName;
        this.price = price;
        this.processor = processor;
    }

}
