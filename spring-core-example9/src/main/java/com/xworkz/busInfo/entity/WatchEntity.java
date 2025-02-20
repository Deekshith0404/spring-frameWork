package com.xworkz.busInfo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "watch_info")
public class WatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
    private Integer price;
}
