package com.xworkz.CountryData;

import com.xworkz.CountryData.config.SpringConfig;
import com.xworkz.CountryData.dto.CountryDto;
import com.xworkz.CountryData.service.CountryService;
import com.xworkz.CountryData.service.CountryServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        CountryService countryService=applicationContext.getBean(CountryService.class);
        CountryDto countryDto=new CountryDto();
        countryDto.setCountry("india");
        countryDto.setNumberOfStates(29);
        countryDto.setPopulation(1400000);

        countryService.validateAndSave(countryDto);

    }
}
