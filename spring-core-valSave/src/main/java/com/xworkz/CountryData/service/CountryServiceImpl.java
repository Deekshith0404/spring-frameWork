package com.xworkz.CountryData.service;

import com.xworkz.CountryData.dto.CountryDto;
import com.xworkz.CountryData.entity.CountryEntity;
import com.xworkz.CountryData.repository.CountryRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryServiceImpl implements CountryService{
    @Autowired
    CountryRepo countryRepo;

    @Override
    public void validateAndSave(CountryDto countryDto) {
        CountryEntity countryEntity=new CountryEntity();
        System.out.println(countryDto);
        BeanUtils.copyProperties(countryDto,countryEntity);
            countryRepo.save(countryEntity);
        System.out.println("data saved successfully");
    }
}
