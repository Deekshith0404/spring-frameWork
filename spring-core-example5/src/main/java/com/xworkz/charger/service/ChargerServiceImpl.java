package com.xworkz.charger.service;

import com.xworkz.charger.dto.ChargerDto;
import com.xworkz.charger.entity.CarEntity;
import com.xworkz.charger.repositery.CarRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarServiceImpl implements CarService{
@Autowired
CarRepo carRepo;
    @Override
    public void validandSave(ChargerDto chargerDto) {
        CarEntity car=new CarEntity();
        BeanUtils.copyProperties(chargerDto,car);
        carRepo.save(car);

    }
}
