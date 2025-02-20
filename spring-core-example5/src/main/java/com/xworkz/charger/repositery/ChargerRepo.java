package com.xworkz.charger.repositery;

import com.xworkz.charger.entity.CarEntity;

public interface CarRepo {
    boolean save(CarEntity carEntity);
}
