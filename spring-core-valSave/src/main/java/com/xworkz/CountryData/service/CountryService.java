package com.xworkz.CountryData.service;

import com.xworkz.CountryData.dto.CountryDto;

public interface CountryService {
    void validateAndSave(CountryDto countryDto);
}
