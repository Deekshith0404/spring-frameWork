package com.xworkz.CountryData.repository;

import com.xworkz.CountryData.entity.CountryEntity;

public interface CountryRepo {

    boolean save(CountryEntity countryEntity);
}
