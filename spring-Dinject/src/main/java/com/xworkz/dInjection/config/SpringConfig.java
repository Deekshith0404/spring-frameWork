package com.xworkz.dInjection.config;

import com.xworkz.dInjection.county.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.xworkz.dInjection")
public class SpringConfig {

    @Bean("list")
    public List getList(){
        return new ArrayList<>();
    }

    @Bean
    public Integer getInteger(){
        return 10;
    }

    @Bean
    public Byte getByte(){
        return 1;
    }

    @Bean
    public Short getShort(){
        return 5;
    }

    @Bean
    public Long getLong(){
        return 789664589l;
    }
    @Bean
    public Boolean getBoolean(){
        return true;
    }
    @Bean
    public Float getFloat(){
        return 44.64129f;
    }

    @Bean
    public Double getDouble(){
        return 45.54;
    }

    @Bean
    public char getChar(){
        return 'g';
    }

    @Bean("getCountryList6")
    public List<Country> getCountryList(){
        Country country=new Country();
        country.setId(10);
        country.setName("India");
        country.setPopulation(120);
        List<Country> list=new ArrayList<>();
        list.add(country);
        return list;
    }
}
