package com.xworkz.CountryData.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto {

    private Integer id;
    private String country;
    private Integer numberOfStates;
    private Integer population;
}
