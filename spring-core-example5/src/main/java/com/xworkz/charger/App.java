package com.xworkz.carInfo;

import com.xworkz.carInfo.config.springConfig;
import com.xworkz.carInfo.dto.CarDto;
import com.xworkz.carInfo.service.CarService;
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
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(springConfig.class);
        CarService carService= applicationContext.getBean(CarService.class);
        CarDto carDto=new CarDto();
        carDto.setBrand("tata");
        carDto.setModel("b6");
        carDto.setPrice(1000000);
        carService.validandSave(carDto);
    }
}
