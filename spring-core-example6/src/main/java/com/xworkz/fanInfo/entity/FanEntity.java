package com.xworkz.charger.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "charger_info")
public class ChargerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
    private Integer price;
}
